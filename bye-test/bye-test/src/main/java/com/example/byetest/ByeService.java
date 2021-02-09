package com.example.byetest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@Slf4j
public class ByeService {

    @Autowired
    private SeatRepository seatRepository;

//    @Autowired
//    private Seat seat;


    public void bye() {

//    Optional<Seat> seatOptional = this.seatRepository.findById("15");
//    Optional<Seat> seatOptional = this.seatRepository.findById(15);

        Optional<Seat> seatOptional = this.seatRepository.findByUserName("userName");
////        Seat seat = seatOptional.get();
        log.info("isPresent:{}",seatOptional.isPresent());

//        String id = seat.getId();
////        String id = this.seat.getId();
////        String id = "13";
//        Seat update = this.seatRepository.useEndDatetime(id);
//        log.info("update:{}",update);
    }
}
