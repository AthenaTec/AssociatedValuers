package com.realappraiser.gharvalue.model;

/**
 * Created by kaptas on 25/12/17.
 */

@SuppressWarnings("ALL")
public class ValuationMethod {

    public int ValuationMethodId;
    public String Name;
    public String CreatedOn;
    public String CreatedBy;
    public String ModifiedOn;
    public String ModifiedBy;

    public int getValuationMethodId() {
        return ValuationMethodId;
    }

    public void setValuationMethodId(int valuationMethodId) {
        ValuationMethodId = valuationMethodId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(String createdOn) {
        CreatedOn = createdOn;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getModifiedOn() {
        return ModifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        ModifiedOn = modifiedOn;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        ModifiedBy = modifiedBy;
    }
}
