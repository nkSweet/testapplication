package com.example.testapplication.service.model;

import java.util.ArrayList;
import java.util.List;

public class CategoryDetails {

    private String categoryName;
    private ArrayList<String> path;
    private ArrayList<String> urls;

    public CategoryDetails(String categoryName, ArrayList<String> path, ArrayList<String> urls) {
        this.categoryName = categoryName;
        this.path = path;
        this.urls = urls;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<String> getPath() {
        return path;
    }

    public void setPath(ArrayList<String> path) {
        this.path = path;
    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }
}
