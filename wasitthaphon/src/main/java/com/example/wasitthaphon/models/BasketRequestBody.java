package com.example.wasitthaphon.models;

import java.util.ArrayList;
import java.util.List;

public class BasketRequestBody {
    private int userId;
    private int productId;
    private int orderQuantity;
    private List<FeatureSelectedRequestBody> featuresSelectedRequestBodies;

    public BasketRequestBody() {
        featuresSelectedRequestBodies = new ArrayList<FeatureSelectedRequestBody>();
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

    public List<FeatureSelectedRequestBody> getFeaturesSelectedRequestBodies() {
        return featuresSelectedRequestBodies;
    }

    public void setFeaturesSelectedRequestBodies(List<FeatureSelectedRequestBody> featuresSelectedRequestBodies) {
        this.featuresSelectedRequestBodies = featuresSelectedRequestBodies;
    }
}
