package com.example.wasitthaphon.models;

public class PaymentByCard {
    private String cardNumber;
    private String holderName;
    private String expireYear;
    private String expireMonth;
    private String securityCode;
    private int shippingInstructionId;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(String expireYear) {
        this.expireYear = expireYear;
    }

    public String getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(String expireMonth) {
        this.expireMonth = expireMonth;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public int getShippingInstructionId() {
        return shippingInstructionId;
    }

    public void setShippingInstructionId(int shippingInstructionId) {
        this.shippingInstructionId = shippingInstructionId;
    }
}
