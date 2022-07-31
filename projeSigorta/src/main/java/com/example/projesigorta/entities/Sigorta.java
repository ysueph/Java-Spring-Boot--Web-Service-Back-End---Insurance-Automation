package com.example.projesigorta.entities;

import lombok.*;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sigorta")
public class Sigorta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long sigortaId;
    @Column(name = "tur")
    public String sigorta_tur;
    @Column(name = "zaman")
    public String sigorta_zaman;


}