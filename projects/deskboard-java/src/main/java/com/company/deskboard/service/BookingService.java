package com.company.deskboard.service;

import com.company.deskboard.model.Booking;
import com.company.deskboard.model.Desk;
import com.company.deskboard.model.User;
import com.company.deskboard.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookDesk(User user, Desk desk, LocalDate date) {
        // Check if already booked
        List<Booking> existing = bookingRepository.findByDeskAndDate(desk, date);
        if (!existing.isEmpty()) {
            throw new RuntimeException("Desk already booked for this date");
        }
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setDesk(desk);
        booking.setDate(date);
        return bookingRepository.save(booking);
    }

    public List<Booking> getBookingsByUser(User user) {
        return bookingRepository.findByUser(user);
    }

    public List<Booking> getBookingsByDate(LocalDate date) {
        return bookingRepository.findByDate(date);
    }
}
