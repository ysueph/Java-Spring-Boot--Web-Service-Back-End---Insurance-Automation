/*--------------------------------
package com.example.projesigorta.services;

import com.example.projesigorta.entities.Admin;
import com.example.projesigorta.repositories.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminRepository adminRepository;
    //ekleme
    public void adminEkle(Admin admin){
        Admin admin1 = new Admin();
        admin1.setKullanici_ad(admin.getKullanici_ad());
        admin1.setSifre(admin.getSifre());
        adminRepository.save(admin1);
    }
    //silme
    public void adminSil(Long id){
        adminRepository.deleteById(id);
    }

    //güncelleme
    public void adminGuncelle(Long id,Admin admin){
        Admin admin1= new Admin();
        admin1.setAdminId(id);
        admin1.setKullanici_ad(admin.getKullanici_ad());
        admin1.setSifre(admin.getSifre());
        adminRepository.save(admin1);

    }
    //getirme
    public  Admin adminGetir(Long id){
        return  adminRepository.findById(id).orElseThrow(()-> new RuntimeException("Aranan id değerinde müşteri bulunamadı "));
    }


}
-------------------------------*/





















    /*---------------------------------
    public Admin adminEkle(Admin admin){
        Admin admin1= new Admin();
        admin1.setKullanici_ad(admin.getKullanici_ad());
        admin1.setSifre(admin.getSifre());
        return admin1;
    }

    public Boolean checkAdminByKullanici_adAndSifre(String Kullanici_ad, String Sifre){
        return adminRepository.findAdminByKullanici_adAndSifre(Kullanici_ad,Sifre).isPresent();
    }

    public Admin giris(String kullanici_ad, String sifre) {
        Optional<Admin> adminOptional = adminRepository.findAdminByKullanici_adAndSifre(kullanici_ad, sifre);
        if (adminOptional.isPresent()) {
            return  adminOptional.get();
        }
        else {
            throw new RuntimeException("Kullanıcı adı veya şifre yanlış!");
        }
    }
    ---------------------------*/





    /*----------------------------
    public String girisWithKullanici_adToken(String kullanici_ad, String sifre){
        Optional<Admin> adminOptional = adminRepository.findAdminByKullanici_adAndSifre(kullanici_ad, sifre);
        Admin admin = adminOptional.get();
        String birlesmisEncode= new String(Base64.getEncoder().encode(( new String(Base64.getEncoder().encode(admin.getKullanici_ad().getBytes(StandardCharsets.UTF_8)))
                +new String(Base64.getEncoder().encode(admin.getSifre().getBytes(StandardCharsets.UTF_8)))).getBytes(StandardCharsets.UTF_8))) ;
        return birlesmisEncode;
    }
    --------------------------------*/

