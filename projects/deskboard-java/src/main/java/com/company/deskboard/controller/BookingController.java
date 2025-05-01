package com.company.deskboard.controller;

import com.company.deskboard.model.Booking;
import com.company.deskboard.model.Desk;
import com.company.deskboard.model.User;
import com.company.deskboard.service.BookingService;
import com.company.deskboard.service.DeskService;
import com.company.deskboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private DeskService deskService;
    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity<?> bookDesk(@RequestParam Long deskId, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date, Principal principal) {
        Optional<User> userOpt = userService.findByUsername(principal.getName());
        Optional<Desk> deskOpt = deskService.getDeskById(deskId);
        if (userOpt.isEmpty() || deskOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid user or desk");
        }
        try {
            Booking booking = bookingService.bookDesk(userOpt.get(), deskOpt.get(), date);
            return ResponseEntity.ok(booking);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/my")
    public ResponseEntity<?> myBookings(Principal principal) {
        Optional<User> userOpt = userService.findByUsername(principal.getName());
        if (userOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid user");
        }
        return ResponseEntity.ok(bookingService.getBookingsByUser(userOpt.get()));
    }
}
