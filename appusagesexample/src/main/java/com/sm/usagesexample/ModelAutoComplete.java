package com.sm.usagesexample;

/**
 * Created by Rz Rasel on 2018-01-10.
 */

public class ModelAutoComplete {
    private String title;
    private String description;

    public ModelAutoComplete(String argTitle, String argDescription) {
        this.title = argTitle;
        this.description = argDescription;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String argTitle) {
        this.title = argTitle;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String argDescription) {
        this.description = argDescription;
    }

    public static ModelAutoComplete onGetSetRow(String argTitle, String argDescription) {
        return new ModelAutoComplete(argTitle, argDescription);
    }
}
