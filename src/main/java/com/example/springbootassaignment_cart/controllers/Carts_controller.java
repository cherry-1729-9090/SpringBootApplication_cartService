package com.example.springbootassaignment_cart.controllers;

import com.example.springbootassaignment_cart.models.carts;
import org.springframework.web.bind.annotation.*;
import com.example.springbootassaignment_cart.services.FakeStoreCartService;

@RestController
public class Carts_controller {
    FakeStoreCartService service;
    public Carts_controller(FakeStoreCartService service){
        this.service = service;
    }
    @GetMapping("/carts/{id}")
    public carts getSingleCart(@PathVariable("id") Long id){
        return service.getSingleCart(id);
    }
    @GetMapping("/carts")
    public carts[] getAllCarts(){
        return service.getAllCarts();
    }
    @GetMapping("/carts/user/{id}")
    public carts[] getUserCarts(@PathVariable("id") Long id){
        return service.getUserCarts(id);
    }

    @PostMapping("/carts")
    public carts AddNewCart(@RequestBody carts cart){
        return service.AddNewCart(cart);
    }

    @GetMapping("/carts?startdate={strt_dt}&enddate={end_dt}")
    public carts[] getCartsInDate(@RequestParam("strt-dt") String start,@RequestParam("end_dt")String end){
        return service.getCartsInDate(start,end);
    }

    @DeleteMapping("/carts/{id}")
    public carts DeleteCart(@PathVariable("id") Long id){
        return service.DeleteCart(id);
    }

    @PutMapping("/carts/{id}")
    public carts updateProduct(@PathVariable("id")Long id,@RequestBody carts cart){
        return service.updateCart(id,cart);
    }
}
