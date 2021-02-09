package com.example.byetest;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeatRepository extends CrudRepository<Seat, String> {


//    Optional<Seat> findById(long id);

    @Query(value = "SELECT * FROM seat_usage_status WHERE user_name = :userName AND use_start_datetime >= CURRENT_DATE() AND use_end_datetime > NOW()")
    List<Seat> findByUserName(@Param("userName") String userName);
//    Optional<Seat> findByUserName(@Param("userName") String userName);

    @Override
    <S extends Seat> S save(S entity);

    @Override
    Optional<Seat> findById(String s);


    @Modifying
    @Query("UPDATE seat_usage_status SET use_end_datetime = CURRENT_TIMESTAMP WHERE id = :id;")
    Seat useEndDatetime(@Param("id") String id);
}
