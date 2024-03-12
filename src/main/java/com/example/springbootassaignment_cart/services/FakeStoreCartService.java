package com.example.springbootassaignment_cart.services;

import com.example.springbootassaignment_cart.dto.cartsdto;
import com.example.springbootassaignment_cart.models.carts;
import com.example.springbootassaignment_cart.models.products;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreCartService implements CartService{
    RestTemplate templae = new RestTemplate();
    @Override
    public carts getSingleCart(Long id) {
        cartsdto SingleCart = templae.getForObject("https://fakestoreapi.com/carts/"+id,cartsdto.class);
        carts cart = casteCart(SingleCart);
        return cart;
    }

    @Override
    public carts[] getAllCarts() {
        cartsdto[] cartsArray = templae.getForObject("https://fakestoreapi.com/carts",cartsdto[].class);
        carts[] Carts = new carts[cartsArray.length];
        for(int i = 0;i < Carts.length;i++){
            Carts[i] = casteCart(cartsArray[i]);
        }
        return Carts;
    }

    @Override
    public carts[] getUserCarts(Long id) {
        cartsdto[] cartsArray = templae.getForObject("https://fakestoreapi.com/carts/user/"+id,cartsdto[].class);
        carts[] Carts = new carts[cartsArray.length];
        for(int i = 0;i < Carts.length;i++){
            Carts[i] = casteCart(cartsArray[i]);
        }
        return Carts;
    }

    @Override
    public carts AddNewCart(carts cart) {
        cartsdto cartsdto = new cartsdto();
        cartsdto.setId(Long.MAX_VALUE);
        cartsdto.setDate(cart.getDate());
        cartsdto.setUserId(cart.getUserId());
        cartsdto.setProducts(new products[cart.getProducts().length]);
        for(int i = 0;i < cart.getProducts().length;i++){
            cartsdto.getProducts()[i] = cart.getProducts()[i];
        }
        cartsdto Cart = templae.postForObject("https://fakestoreapi.com/carts",cartsdto, cartsdto.class);
        return casteCart(Cart);
    }

    @Override
    public carts[] getCartsInDate(String start_date, String end_date) {
        cartsdto[] carts = templae.getForObject("https://fakestoreapi.com/carts?startdate="+start_date+"&enddate="+end_date, cartsdto[].class);
        carts[] Cart = new carts[carts.length];
        for(int i = 0;i < carts.length;i++){
            Cart[i] = casteCart(carts[i]);
        }
        return Cart;
    }

    @Override
    public carts DeleteCart(Long id) {
        templae.delete("https://fakestoreapi.com/carts/"+id);
        return getSingleCart(id);
    }

    @Override
    public carts updateCart(Long id,carts cart) {
        cartsdto Cart = new cartsdto();
        Cart.setDate(cart.getDate());
        Cart.setUserId(cart.getUserId());
        Cart.setId(id);
        Cart.setProducts(new products[cart.getProducts().length]);
        for(int i = 0;i < cart.getProducts().length;i++){
            Cart.getProducts()[i] = cart.getProducts()[i];
        }
        templae.put("https://fakestoreapi.com/carts/"+Cart.getId(),Cart);
        cart.setId(id);
        return cart;
    }


    public carts casteCart(cartsdto SingleCart){
        carts cart = new carts();
        cart.setDate(SingleCart.getDate());
        cart.setId(SingleCart.getId());
        cart.setUserId(SingleCart.getUserId());
        cart.setProducts(new products[SingleCart.getProducts().length]);
        for(int i = 0;i < SingleCart.getProducts().length;i++){
            cart.getProducts()[i] = SingleCart.getProducts()[i];
        }
        return cart;
    }
}
