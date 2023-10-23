package com.example.Jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Burger")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "is_vegan")
    private boolean isVegan;
    @Column(name = "breadType")
    private String breadType;
    @Column(name = "contents")
    private String contents;
}


