package com.company.deskboard.model;

import jakarta.persistence.*;

@Entity
public class Desk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String deskNumber;

    @Column(nullable = false)
    private boolean available = true;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDeskNumber() { return deskNumber; }
    public void setDeskNumber(String deskNumber) { this.deskNumber = deskNumber; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
