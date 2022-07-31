package com.example.projesigorta.repositories;

import com.example.projesigorta.entities.Sirket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SirketRepository extends JpaRepository<Sirket,Long> {
    List<Sirket> findAll();
}
