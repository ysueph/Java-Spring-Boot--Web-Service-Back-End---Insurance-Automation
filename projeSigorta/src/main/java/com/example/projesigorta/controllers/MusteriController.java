package com.example.projesigorta.controllers;
import com.example.projesigorta.entities.Musteri;
import com.example.projesigorta.repositories.MusteriRepository;
import com.example.projesigorta.services.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
public class MusteriController {
    private final MusteriService musteriService;
    private final MusteriRepository musteriRepository;

    @GetMapping("/Musteriler/{id}")
    public Musteri musteriGetir(@PathVariable Long id){
        return musteriService.musteriGetir(id);
    }

    @GetMapping("/Musteriler")
    public List<Musteri> musteriGetirAll(){
        return musteriRepository.findAll();
    }

    @DeleteMapping("/Musteriler/{id}")
    public void musteriSil(@PathVariable Long id){
        musteriService.musteriSil(id);
    }

    @PostMapping("/Musteriler")
    public void musteriEkle(@RequestBody Musteri musteri){
        musteriService.musteriEkle(musteri);
    }

    @PutMapping("/Musteriler/{id}")
    public void musteriGuncelle(@PathVariable Long id ,@RequestBody Musteri musteri){
        musteriService.musteriGuncelle(id, musteri);
    }

}
