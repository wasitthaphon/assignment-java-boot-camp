package com.example.wasitthaphon.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "feature")
public class Feature {
    @Id
    private int featureId;
    private int productId;
    private String name;
    private Boolean isRequired;
    private int selectedOption;

    @OneToMany(mappedBy = "feature")
    private List<FeatureOption> featureOptions;

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

    public List<FeatureOption> getFeatureOptions() {
        return featureOptions;
    }

    public void setFeatureOptions(List<FeatureOption> featureOptions) {
        this.featureOptions = featureOptions;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

}
