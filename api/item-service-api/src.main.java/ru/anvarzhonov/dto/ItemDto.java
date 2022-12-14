package ru.anvarzhonov.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemDto {
    private String name;
    private String size;
    private BigDecimal price;
}
