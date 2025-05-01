package com.company.deskboard.service;

import com.company.deskboard.model.Desk;
import com.company.deskboard.repository.DeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeskService {
    @Autowired
    private DeskRepository deskRepository;

    public List<Desk> getAllDesks() {
        return deskRepository.findAll();
    }

    public Optional<Desk> getDeskById(Long id) {
        return deskRepository.findById(id);
    }

    public Desk saveDesk(Desk desk) {
        return deskRepository.save(desk);
    }
}
