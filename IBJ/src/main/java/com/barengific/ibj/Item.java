package com.barengific.ibj;

public class Item {
    public String description;
    public String quantity;
    public String unitPrice;
    public String vatPer;
    public String vatPrice;
    public String totalPrice;

    public Item(String description, String quantity, String unitPrice, String vatPer, String vatPrice, String totalPrice) {
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.vatPer = vatPer;
        this.vatPrice = vatPrice;
        this.totalPrice = totalPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getVatPer() {
        return vatPer;
    }

    public void setVatPer(String vatPer) {
        this.vatPer = vatPer;
    }

    public String getVatPrice() {
        return vatPrice;
    }

    public void setVatPrice(String vatPrice) {
        this.vatPrice = vatPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
