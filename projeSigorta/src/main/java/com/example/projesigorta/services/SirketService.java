package com.example.projesigorta.services;

import com.example.projesigorta.entities.Sirket;
import com.example.projesigorta.repositories.SirketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SirketService {
    private final SirketRepository sirketRepository;
    //ekleme
    public void sirketEkle(Sirket sirket){
        Sirket sirket1 = new Sirket();
        sirket1.setSirket_ad(sirket.getSirket_ad());
        sirket1.setFiyat(sirket.getFiyat());
        sirketRepository.save(sirket1);
    }
    //silme
    public void sirketSil(Long id){
        sirketRepository.deleteById(id);
    }
    //güncelleme
    public void sirketGuncelle(Long id,Sirket sirket){
        Sirket sirket1= new Sirket();
        sirket1.setSirketId(id);
        sirket1.setSirket_ad(sirket.getSirket_ad());
        sirket1.setFiyat(sirket.getFiyat());
        sirketRepository.save(sirket1);

    }
    //getirme
    public Sirket sirketGetir(Long id){
        return sirketRepository.findById(id).orElseThrow(()-> new RuntimeException("Aranan id değerinde sirket bulunamadı "));
    }


}