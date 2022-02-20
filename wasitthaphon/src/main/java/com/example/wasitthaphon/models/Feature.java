package com.example.wasitthaphon.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feature {
    @Id
    private int featureId;
    private int productId;
    private String name;
    private Boolean isRequired;
    private String options;

    public int getFeatureId() {
        return featureId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setFeatureId(int featuresId) {
        this.featureId = featuresId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

}
