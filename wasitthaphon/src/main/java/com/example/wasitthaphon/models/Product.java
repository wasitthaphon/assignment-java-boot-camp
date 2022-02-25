package com.example.wasitthaphon.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    private int productId;
    private int storeId;
    private String title;
    private Double price;
    private Boolean hasDiscount;
    private int discount;
    private String discountExpiredDate;
    private Double rating;
    private int reviewerCount;
    private String sellCity;
    private String productProfileImageUrl;
    private int orderQuantity;

    @OneToMany(mappedBy = "product")
    private List<Feature> features;

    public int getProductId() {
        return productId;
    }

    public String getProductProfileImageUrl() {
        return productProfileImageUrl;
    }

    public void setProductProfileImageUrl(String productProfileImageUrl) {
        this.productProfileImageUrl = productProfileImageUrl;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDiscountExpiredDate() {
        return discountExpiredDate;
    }

    public void setDiscountExpiredDate(String discountExpiredDate) {
        this.discountExpiredDate = discountExpiredDate;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getReviewerCount() {
        return reviewerCount;
    }

    public void setReviewerCount(int reviewerCount) {
        this.reviewerCount = reviewerCount;
    }

    public String getSellCity() {
        return sellCity;
    }

    public void setSellCity(String sellCity) {
        this.sellCity = sellCity;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

}
