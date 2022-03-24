package com.nearbuck.simplebillingappoffline.models;

public class ItemList {

    private String itemName;
    private String itemCode;
    private Double itemPrice;
    private Double itemQuantity;

    public ItemList(String itemName, String itemCode, Double itemPrice, Double itemQuantity) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public Double getItemQuantity() {
        return itemQuantity;
    }
}
