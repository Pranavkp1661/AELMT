package com.Pranav.aelmachinetest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelatedBook {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("content_code")
    @Expose
    private String contentCode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("originalPrice")
    @Expose
    private String originalPrice;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("publisherName")
    @Expose
    private String publisherName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RelatedBook withId(String id) {
        this.id = id;
        return this;
    }

    public String getContentCode() {
        return contentCode;
    }

    public void setContentCode(String contentCode) {
        this.contentCode = contentCode;
    }

    public RelatedBook withContentCode(String contentCode) {
        this.contentCode = contentCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RelatedBook withName(String name) {
        this.name = name;
        return this;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public RelatedBook withImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public RelatedBook withOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public RelatedBook withPrice(String price) {
        this.price = price;
        return this;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public RelatedBook withPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

}
