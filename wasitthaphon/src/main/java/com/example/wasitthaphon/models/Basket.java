package com.example.wasitthaphon.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "basket")
public class Basket {
    @Id
    private int basketId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user;

    @OneToMany
    @JoinColumn(name = "product_id", nullable = true)
    private List<Product> products;

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
