package com.example.wasitthaphon.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "feature")
public class Feature {
    @Id
    private int id;
    private String name;
    private Boolean isRequired;
    private int selectedOption;

    @ManyToOne
    @JsonBackReference
    private Product product;

    @OneToMany(mappedBy = "feature")
    @JsonManagedReference
    private List<FeatureOption> featureOptions;

    public Feature() {
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

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<FeatureOption> getFeatureOptions() {
        return featureOptions;
    }

    public void setFeatureOptions(List<FeatureOption> featureOptions) {
        this.featureOptions = featureOptions;
    }

}
