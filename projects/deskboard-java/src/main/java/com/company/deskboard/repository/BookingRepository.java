package com.company.deskboard.repository;

import com.company.deskboard.model.Booking;
import com.company.deskboard.model.Desk;
import com.company.deskboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUser(User user);
    List<Booking> findByDeskAndDate(Desk desk, LocalDate date);
    List<Booking> findByDate(LocalDate date);
}
