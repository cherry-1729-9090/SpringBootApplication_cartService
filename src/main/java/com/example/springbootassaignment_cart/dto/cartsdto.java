package com.example.springbootassaignment_cart.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class cartsdto {
    private Long id;
    private Long userId;
    private String date;
    private com.example.springbootassaignment_cart.models.products[] products;
}
