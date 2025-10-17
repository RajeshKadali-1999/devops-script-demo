package com.example.demo.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CartItem;
import com.example.demo.repository.CartItemRepository;

@Service
public class CartService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public List<CartItem> getCartItemsByUser(Long userId) {
        return cartItemRepository.findByUser_Id(userId);
    }

    public CartItem addToCart(CartItem item) {
        return cartItemRepository.save(item);
    }

    public void removeCartItem(Long itemId) {
        cartItemRepository.deleteById(itemId);
    }
}
