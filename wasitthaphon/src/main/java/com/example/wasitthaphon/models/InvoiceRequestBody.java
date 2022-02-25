package com.example.wasitthaphon.models;

public class InvoiceRequestBody {
    private int userId;
    private int shippingInstructionId;
    private String transactionDate;
    private String expiredDate;
    private double totalAmount;

    public int getShippingInstructionId() {
        return shippingInstructionId;
    }

    public void setShippingInstructionId(int shippingInstructionId) {
        this.shippingInstructionId = shippingInstructionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
