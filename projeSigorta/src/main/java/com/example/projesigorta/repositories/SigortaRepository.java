package com.example.projesigorta.repositories;
import com.example.projesigorta.entities.Sigorta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SigortaRepository extends JpaRepository<Sigorta,Long> {
    List<Sigorta> findAll();
}
