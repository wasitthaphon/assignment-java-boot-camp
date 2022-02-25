package com.example.wasitthaphon.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

    @OneToOne
    @JoinColumn(name = "product_id", nullable = true)
    private Product product;

    private int orderQty;

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

}
