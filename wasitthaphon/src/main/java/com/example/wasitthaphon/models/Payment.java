package com.example.wasitthaphon.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Payment {
    @Id
    private int paymentId;
    private String paymentMethod;

    @OneToOne
    @JoinColumn(name = "shippingInstruction_id")
    private ShippingInstruction shippingInstruction;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public ShippingInstruction getShippingInstruction() {
        return shippingInstruction;
    }

    public void setShippingInstruction(ShippingInstruction shippingInstruction) {
        this.shippingInstruction = shippingInstruction;
    }

}
