package com.example.projesigorta.services;

import com.example.projesigorta.entities.Musteri;
import com.example.projesigorta.repositories.MusteriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MusteriService {

    private final MusteriRepository musteriRepository;
    //ekleme
    public void musteriEkle(Musteri musteri){
        Musteri musteri1 = new Musteri();
        musteri1.setMusteri_ad(musteri.getMusteri_ad());
        musteri1.setMusteri_kimlik(musteri.getMusteri_kimlik());
        musteri1.setMusteri_plaka(musteri.getMusteri_plaka());
        //--
        musteri1.setSigorta_tur(musteri.getSigorta_tur());
        musteri1.setSigorta_zaman(musteri.getSigorta_zaman());
        //--
        musteri1.setSirket_ad( musteri.getSirket_ad());
        musteri1.setFiyat( musteri.getFiyat());

        musteriRepository.save(musteri1);
    }
    //silme
    public void musteriSil(Long id){
        musteriRepository.deleteById(id);
    }

    //güncelleme
    public void musteriGuncelle(Long id,Musteri musteri){
        Musteri musteri1= new Musteri();
        musteri1.setMusteriId(id);
        musteri1.setMusteri_ad(musteri.getMusteri_ad());
        musteri1.setMusteri_kimlik(musteri.getMusteri_kimlik());
        musteri1.setMusteri_plaka(musteri.getMusteri_plaka());
        //--
        musteri1.setSigorta_tur(musteri.getSigorta_tur());
        musteri1.setSigorta_zaman(musteri.getSigorta_zaman());
        //--
        musteri1.setSirket_ad( musteri.getSirket_ad());
        musteri1.setFiyat( musteri.getFiyat());
        musteriRepository.save(musteri1);

    }
    //getirme
    public  Musteri musteriGetir(Long id){
        return  musteriRepository.findById(id).orElseThrow(()-> new RuntimeException("Aranan id değerinde müşteri bulunamadı "));
    }



}
