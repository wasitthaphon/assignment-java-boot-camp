package com.example.wasitthaphon.models;

import java.util.ArrayList;
import java.util.List;

public class BasketRequestBody {
    private int userId;
    private int productId;
    private int orderQuantity;
    private List<FeatureSelected> featuresSelected;

    public BasketRequestBody() {
        featuresSelected = new ArrayList<FeatureSelected>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public List<FeatureSelected> getFeaturesSelected() {
        return featuresSelected;
    }

    public void setFeaturesSelected(List<FeatureSelected> featuresSelected) {
        this.featuresSelected = featuresSelected;
    }
}
