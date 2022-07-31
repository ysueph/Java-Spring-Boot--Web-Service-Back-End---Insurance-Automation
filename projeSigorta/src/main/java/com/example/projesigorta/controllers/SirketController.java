package com.example.projesigorta.controllers;
import com.example.projesigorta.entities.Sirket;
import com.example.projesigorta.repositories.SirketRepository;
import com.example.projesigorta.services.SirketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
public class SirketController {
    private final SirketService sirketService;
    private final SirketRepository sirketRepository;

    @GetMapping("/Sirketler/{id}")
    public Sirket sirketGetir(@PathVariable Long id){
        return sirketService.sirketGetir(id);
    }

    @GetMapping("/Sirketler")
    public List<Sirket> sirketGetirAll(){
        return sirketRepository.findAll();
    }

    @DeleteMapping("/Sirketler/{id}")
    public void sirketSil(@PathVariable Long id){
        sirketService.sirketSil(id);
    }

    @PostMapping("/Sirketler")
    public void sirketEkle(@RequestBody Sirket sirket){
        sirketService.sirketEkle(sirket);
    }

    @PutMapping("/Sirketler/{id}")
    public void sirketGuncelle(@PathVariable Long id ,@RequestBody Sirket sirket){
        sirketService.sirketGuncelle(id, sirket);
    }

}
