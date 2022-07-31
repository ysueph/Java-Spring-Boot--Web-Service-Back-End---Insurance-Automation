package com.example.projesigorta.services;

import com.example.projesigorta.entities.Sigorta;
import com.example.projesigorta.repositories.SigortaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SigortaService {
    private final SigortaRepository sigortaRepository;
    //ekleme
    public void sigortaEkle(Sigorta sigorta){
        Sigorta sigorta1 = new Sigorta();
        sigorta1.setSigorta_tur(sigorta.getSigorta_tur());
        sigorta1.setSigorta_zaman(sigorta.getSigorta_zaman());
        sigortaRepository.save(sigorta1);
    }
    //silme
    public void sigortaSil(Long id){
        sigortaRepository.deleteById(id);
    }

    //güncelleme
    public void sigortaGuncelle(Long id,Sigorta sigorta){
        Sigorta sigorta1= new Sigorta();
        sigorta1.setSigortaId(id);
        sigorta1.setSigorta_tur(sigorta.getSigorta_tur());
        sigorta1.setSigorta_zaman(sigorta.getSigorta_zaman());
        sigortaRepository.save(sigorta1);

    }
    //getirme
    public  Sigorta sigortaGetir(Long id){
        return  sigortaRepository.findById(id).orElseThrow(()-> new RuntimeException("Aranan id değerinde sigorta bulunamadı "));
    }


}