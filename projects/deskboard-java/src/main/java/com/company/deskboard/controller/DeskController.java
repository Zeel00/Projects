package com.company.deskboard.controller;

import com.company.deskboard.model.Desk;
import com.company.deskboard.service.DeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/desks")
public class DeskController {
    @Autowired
    private DeskService deskService;

    @GetMapping("")
    public List<Desk> getAllDesks() {
        return deskService.getAllDesks();
    }

    // Admin: Add desk
    @PostMapping("")
    public Desk addDesk(@RequestBody Desk desk) {
        return deskService.saveDesk(desk);
    }
}
