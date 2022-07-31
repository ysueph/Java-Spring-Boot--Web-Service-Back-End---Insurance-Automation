package com.example.projesigorta.controllers;
import com.example.projesigorta.entities.Sigorta;
import com.example.projesigorta.repositories.SigortaRepository;
import com.example.projesigorta.services.SigortaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
public class SigortaController {
    private final SigortaService sigortaService;
    private final SigortaRepository sigortaRepository;

    @GetMapping("/Sigortalar/{id}")
    public Sigorta sigortaGetir(@PathVariable Long id){
        return sigortaService.sigortaGetir(id);
    }

    @GetMapping("/Sigortalar")
    public List<Sigorta> sigortaGetirAll(){return sigortaRepository.findAll();
    }

    @DeleteMapping("/Sigortalar/{id}")
    public void sigortaSil(@PathVariable Long id){
        sigortaService.sigortaSil(id);
    }

    @PostMapping("/Sigortalar")
    public void sigortaEkle(@RequestBody Sigorta sigorta){
       sigortaService.sigortaEkle(sigorta);
    }

    @PutMapping("/Sigortalar/{id}")
    public void sigortaGuncelle(@PathVariable Long id ,@RequestBody Sigorta sigorta){
        sigortaService.sigortaGuncelle(id, sigorta);
    }

}
