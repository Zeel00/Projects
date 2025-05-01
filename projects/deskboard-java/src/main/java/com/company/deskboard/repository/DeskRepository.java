package com.company.deskboard.repository;

import com.company.deskboard.model.Desk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeskRepository extends JpaRepository<Desk, Long> {
}
