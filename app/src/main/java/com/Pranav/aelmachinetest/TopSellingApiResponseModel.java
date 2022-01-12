package com.Pranav.aelmachinetest;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class TopSellingApiResponseModel {

    @SerializedName("id")
    private int id;
    @SerializedName("image_path")
    private String image_path;
    @SerializedName("name")
    private String name;
    @SerializedName("code")
    private String code;
    @SerializedName("universityName")
    private String universityName;
    @SerializedName("price")
    private int price;
    @SerializedName("crossPrice")
    private int crossPrice;
    @SerializedName("discount")
    private String discount;
    @SerializedName("buyStatus")
    private String buyStatus;
    @SerializedName("libraryStatus")
    private String libraryStatus;

    public TopSellingApiResponseModel(int id, String image_path, String name, String code, String universityName, int price, int crossPrice, String discount, String buyStatus, String libraryStatus) {
        this.id = id;
        this.image_path = image_path;
        this.name = name;
        this.code = code;
        this.universityName = universityName;
        this.price = price;
        this.crossPrice = crossPrice;
        this.discount = discount;
        this.buyStatus = buyStatus;
        this.libraryStatus = libraryStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCrossPrice() {
        return crossPrice;
    }

    public void setCrossPrice(int crossPrice) {
        this.crossPrice = crossPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getBuyStatus() {
        return buyStatus;
    }

    public void setBuyStatus(String buyStatus) {
        this.buyStatus = buyStatus;
    }

    public String getLibraryStatus() {
        return libraryStatus;
    }

    public void setLibraryStatus(String libraryStatus) {
        this.libraryStatus = libraryStatus;
    }
}

