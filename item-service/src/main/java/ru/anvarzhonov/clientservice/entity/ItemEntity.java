package ru.anvarzhonov.clientservice.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "items")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private Size size;
    private BigDecimal price;
    private Integer clientId;
    private Status status;

    public enum Status {
        FREE, RENTED
    }

    public enum Size {
        XS, S, M, L, XL
    }
}
