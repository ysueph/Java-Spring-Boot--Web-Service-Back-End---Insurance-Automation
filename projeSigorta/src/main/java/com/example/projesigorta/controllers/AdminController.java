/*--------------------------------
package com.example.projesigorta.controllers;
import com.example.projesigorta.entities.Admin;
import com.example.projesigorta.repositories.AdminRepository;
import com.example.projesigorta.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final AdminRepository adminRepository;
    //private final TokenSecurity tokenSecurity;

    @GetMapping("/AdminGetir/{id}")
    public Admin adminGetir(@PathVariable Long id){
        return adminService.adminGetir(id);
    }

    @DeleteMapping("/AdminSil/{id}")
    public void adminSil(@PathVariable Long id){
        adminService.adminSil(id);
    }

    @PostMapping("/AdminEkle")
    public void adminEkle(@RequestBody Admin admin){
        adminService.adminEkle(admin);
    }

    @PutMapping("/AdminGuncelle/{id}")
    public void adminGuncelle(@PathVariable Long id ,@RequestBody Admin admin){
        adminService.adminGuncelle(id, admin);
    }
    @GetMapping("/Adminler")
    public List<Admin> adminGetirAll(){
        return adminRepository.findAll();
    }




}-------------------------------*/
