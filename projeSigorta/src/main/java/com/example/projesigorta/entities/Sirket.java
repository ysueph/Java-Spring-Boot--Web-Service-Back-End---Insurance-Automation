package com.example.projesigorta.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sirket")
public class Sirket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long sirketId;
    @Column(name = "ad")
    public String sirket_ad;
    @Column(name = "fiyat")
    public Long fiyat;

}