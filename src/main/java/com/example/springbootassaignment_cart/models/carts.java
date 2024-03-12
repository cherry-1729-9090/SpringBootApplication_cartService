package com.example.springbootassaignment_cart.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class carts {
    private Long id;
    private Long userId;
    private String date;
    private products[] products;
}
