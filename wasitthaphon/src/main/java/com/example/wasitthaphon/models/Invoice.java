package com.example.wasitthaphon.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    private int invoiceId;

    @OneToOne
    @JoinColumn(name = "shippingInstruction_id")
    private ShippingInstruction shippingInstruction;

    private String invoiceFilePath;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public ShippingInstruction getShippingInstruction() {
        return shippingInstruction;
    }

    public void setShippingInstruction(ShippingInstruction shippingInstruction) {
        this.shippingInstruction = shippingInstruction;
    }

    public String getInvoiceFilePath() {
        return invoiceFilePath;
    }

    public void setInvoiceFilePath(String invoiceFilePath) {
        this.invoiceFilePath = invoiceFilePath;
    }
}
