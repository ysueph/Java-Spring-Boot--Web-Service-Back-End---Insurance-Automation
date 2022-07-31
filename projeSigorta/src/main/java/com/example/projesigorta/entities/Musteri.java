package com.example.projesigorta.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "musteri")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long musteriId;
    @Column(name = "ad")
    public String musteri_ad;
    @Column(name = "tc")
    public String musteri_kimlik;
    @Column(name = "plaka")
    public String musteri_plaka;


    @Column(name = "sigorta_tur")
    public String sigorta_tur;
    @Column(name = "sigorta_zaman")
    public String sigorta_zaman;
    @Column(name = "sirket_ad")
    public String sirket_ad;
    @Column(name = "sirket_fiyat")
    public Long fiyat;

}
