package com.mingalar.movieticketing.service.implementations;

import com.mingalar.movieticketing.model.Bookings;
import com.mingalar.movieticketing.model.ShowDetails;
import com.mingalar.movieticketing.payload.request.CreateBookingRequest;
import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.payload.response.ResponseFactory;
import com.mingalar.movieticketing.repository.BookingRepo;
import com.mingalar.movieticketing.repository.ShowDetailsRepo;
import com.mingalar.movieticketing.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookingService implements IBookingService {
    @Autowired
    ResponseFactory responseFactory;

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    ShowDetailsRepo showDetailsRepo;

    @Override
    public ResponseEntity<BaseResponse> createBookings(CreateBookingRequest createBookingRequest) {
        List<String> seatList = Arrays.asList(createBookingRequest.getSeatNumbers().split(","));
        Optional<ShowDetails> showDetails = showDetailsRepo.findById(createBookingRequest.getShowDetailsId());
        List<String> takenSeatList = Arrays.asList(showDetails.get().getTakenSeats().split(","));

        for(int i=0;i<seatList.size();i++){
            String row =seatList.get(i).substring(0,1);
            Integer seatNumber = Integer.parseInt(seatList.get(i).substring(1));
            List<String> rowList = new ArrayList<>();
            rowList.addAll(Arrays.asList("a","b","c","d","e","f","g","h","i"));
            if (rowList.contains(row.toLowerCase(Locale.ROOT))) return responseFactory.buildError(HttpStatus.BAD_REQUEST,"Bad Seat Format");
            if (seatNumber<0 || seatNumber>19) return responseFactory.buildError(HttpStatus.BAD_REQUEST,"Bad Seat Format");

            if (takenSeatList.contains(seatList.get(i))){
                return responseFactory.buildError(HttpStatus.BAD_REQUEST,"Seat already taken");
            }
            else {
                takenSeatList.add(seatList.get(i));
            }
        }


        Bookings bookings=new Bookings();
        bookings.setMovieId(createBookingRequest.getMovieId());
        bookings.setCustomerPhone(createBookingRequest.getCustomerPhone());
        bookings.setSeatNumbers(createBookingRequest.getSeatNumbers());
        bookings.setTheatreName(createBookingRequest.getTheatreName());
        bookings.setShowDetailsId(createBookingRequest.getShowDetailsId());
        bookings.setTotalPrice(createBookingRequest.getTotalPrice());
        bookings.setTotalSeats(seatList.size());

        showDetails.get().setTakenSeats(String.join(",", takenSeatList));

        return responseFactory.buildSuccess(HttpStatus.OK,null,"Successfully booked");
    }
}
