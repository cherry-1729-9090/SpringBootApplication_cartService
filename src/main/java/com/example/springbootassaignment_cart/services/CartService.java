package com.example.springbootassaignment_cart.services;

import com.example.springbootassaignment_cart.models.carts;

public interface CartService {
    public carts getSingleCart(Long id);
    public carts[] getAllCarts();
    public carts[] getUserCarts(Long id);
    public carts AddNewCart(carts cart);
    public carts[] getCartsInDate(String start_date,String end_date);
    public carts DeleteCart(Long id);

    public carts updateCart(Long id,carts cart);
}
