package com.example.byetest;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class Seat {

    @Id
    private final Long id;
    private final Long seatId;
    private final String userName;
    private final String useStartDatetime;
    private final String useEndDatetime;
    private final String createdById;
    private final String createdAt;
    private final String lastModifiedById;
    private final String lastModifiedAt;

//@Id
//private long id;
//private long seatCode;
//private String userName;
//private java.sql.Timestamp useStartDatetime;
//private java.sql.Timestamp useEndDatetime;
//private String createdById;
//private java.sql.Timestamp createdAt;
//private String lastModifiedById;
//private java.sql.Timestamp lastModifiedAt;



}
