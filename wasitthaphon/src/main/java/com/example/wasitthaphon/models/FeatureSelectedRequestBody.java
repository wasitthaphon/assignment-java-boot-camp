package com.example.wasitthaphon.models;

public class FeatureSelectedRequestBody {
    private int featureId;

    private int featureOptionId;

    public FeatureSelectedRequestBody() {
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public int getFeatureOptionId() {
        return featureOptionId;
    }

    public void setFeatureOptionId(int featureOptionId) {
        this.featureOptionId = featureOptionId;
    }

}
