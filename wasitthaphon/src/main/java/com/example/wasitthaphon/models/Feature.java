package com.example.wasitthaphon.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feature")
public class Feature {
    @Id
    private int featureId;
    private String name;
    private Boolean isRequired;
    private int selectedOption;

    @OneToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "feature")
    private List<FeatureOption> featureOptions;

    public int getFeatureId() {
        return featureId;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
