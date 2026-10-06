package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DonViTinh")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DonViTinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idDonViTinh;
}
