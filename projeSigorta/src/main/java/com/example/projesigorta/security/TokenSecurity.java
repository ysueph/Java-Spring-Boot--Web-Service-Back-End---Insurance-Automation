/*--------------------------------
package com.example.projesigorta.security;

import com.example.projesigorta.entities.Admin;
import com.example.projesigorta.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RequiredArgsConstructor
@Service
public class TokenSecurity {

    private final AdminService adminService;

    public String generateToken(Admin account){
        String token = account.getAdminId()+":"+account.getKullanici_ad()+":"+account.getSifre();
        return Base64.getEncoder().encodeToString(token.getBytes(StandardCharsets.UTF_8));
    }

    private Admin decodeToken(String token){
        String decryptedToken = new String(Base64.getMimeDecoder().decode(token));
        String[] splitToken = decryptedToken.split(":");
        return new Admin(Long.valueOf(splitToken[0]),splitToken[1],splitToken[2]);
    }

    public void validateToken(String token){
        Admin admin = decodeToken(token);
        if(!adminService.checkAdminByKullanici_adAndSifre(admin.getKullanici_ad(),admin.getSifre())){
            throw new RuntimeException("Kullanıcı Sisteme Kayıtlı Değil!!");
        }
    }
}
-------------------------------*/

