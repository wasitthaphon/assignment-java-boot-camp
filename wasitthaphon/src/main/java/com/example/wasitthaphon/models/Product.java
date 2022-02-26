package com.example.wasitthaphon.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "product")
public class Product {
    @Id
    private int id;
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
    private int onhandQuantity;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Feature> features;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ProductImage> productImages;

    public int getOnhandQuantity() {
        return onhandQuantity;
    }

    public void setOnhandQuantity(int onhandQuantity) {
        this.onhandQuantity = onhandQuantity;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }

}
