package com.Pranav.aelmachinetest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookInfo {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("publisher_id")
    @Expose
    private String publisherId;
    @SerializedName("pub_cat_id")
    @Expose
    private String pubCatId;
    @SerializedName("universityName")
    @Expose
    private String universityName;
    @SerializedName("courseCode")
    @Expose
    private String courseCode;
    @SerializedName("author_name")
    @Expose
    private String authorName;
    @SerializedName("regulation")
    @Expose
    private String regulation;
    @SerializedName("categories")
    @Expose
    private String categories;
    @SerializedName("content_desc")
    @Expose
    private String contentDesc;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("originalPrice")
    @Expose
    private String originalPrice;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("buyStatus")
    @Expose
    private Boolean buyStatus;
    @SerializedName("libraryStatus")
    @Expose
    private Boolean libraryStatus;
    @SerializedName("cart")
    @Expose
    private String cart;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BookInfo withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookInfo withName(String name) {
        this.name = name;
        return this;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public BookInfo withPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    public String getPubCatId() {
        return pubCatId;
    }

    public void setPubCatId(String pubCatId) {
        this.pubCatId = pubCatId;
    }

    public BookInfo withPubCatId(String pubCatId) {
        this.pubCatId = pubCatId;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public BookInfo withUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public BookInfo withCourseCode(String courseCode) {
        this.courseCode = courseCode;
        return this;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public BookInfo withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public String getRegulation() {
        return regulation;
    }

    public void setRegulation(String regulation) {
        this.regulation = regulation;
    }

    public BookInfo withRegulation(String regulation) {
        this.regulation = regulation;
        return this;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public BookInfo withCategories(String categories) {
        this.categories = categories;
        return this;
    }

    public String getContentDesc() {
        return contentDesc;
    }

    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }

    public BookInfo withContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
        return this;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public BookInfo withImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BookInfo withOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public BookInfo withPrice(String price) {
        this.price = price;
        return this;
    }

    public Boolean getBuyStatus() {
        return buyStatus;
    }

    public void setBuyStatus(Boolean buyStatus) {
        this.buyStatus = buyStatus;
    }

    public BookInfo withBuyStatus(Boolean buyStatus) {
        this.buyStatus = buyStatus;
        return this;
    }

    public Boolean getLibraryStatus() {
        return libraryStatus;
    }

    public void setLibraryStatus(Boolean libraryStatus) {
        this.libraryStatus = libraryStatus;
    }

    public BookInfo withLibraryStatus(Boolean libraryStatus) {
        this.libraryStatus = libraryStatus;
        return this;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public BookInfo withCart(String cart) {
        this.cart = cart;
        return this;
    }

}
