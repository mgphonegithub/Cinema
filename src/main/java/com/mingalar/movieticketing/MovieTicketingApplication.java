package com.mingalar.movieticketing;

//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MovieTicketingApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(MovieTicketingApplication.class, args);

//        FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(GoogleCredentials.getApplicationDefault())
//                .build();
//
//        FirebaseApp.initializeApp(options);
    }

}
