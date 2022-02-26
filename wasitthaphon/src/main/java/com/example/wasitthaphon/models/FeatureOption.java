package com.example.wasitthaphon.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "featureOption")
public class FeatureOption {
    @Id
    private int featureOptionId;

    @OneToOne
    @JoinColumn(name = "feature_id", nullable = false)
    @JsonBackReference
    private Feature feature;

    private String option;

    public int getFeatureOptionId() {
        return featureOptionId;
    }

    public void setFeatureOptionId(int featureOptionId) {
        this.featureOptionId = featureOptionId;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
