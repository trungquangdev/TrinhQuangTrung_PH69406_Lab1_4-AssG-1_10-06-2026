package com.example.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

@Entity
@Table(name = "chiTietSanPham")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChiTietSp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idCTSP;
    @Column
    private Integer soLuongTon;
    @Column
    private Float donGia;
    @Column(name = "barcode")
    private String barCode;
    @Column
    private String ghiChu;
    @Column
    private String createdAt;
    @Column
    private Integer createdBy;
    @Column
    private String updatedAt;
    @Column
    private Integer updatedBy;
    @Column
    private Boolean deleted;
}
