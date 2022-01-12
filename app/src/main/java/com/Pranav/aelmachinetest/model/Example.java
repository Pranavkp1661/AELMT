package com.Pranav.aelmachinetest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("publisherDetails")
    @Expose
    private PublisherDetails publisherDetails;
    @SerializedName("bookInfo")
    @Expose
    private BookInfo bookInfo;
    @SerializedName("relatedBooks")
    @Expose
    private List<RelatedBook> relatedBooks = null;

    public PublisherDetails getPublisherDetails() {
        return publisherDetails;
    }

    public void setPublisherDetails(PublisherDetails publisherDetails) {
        this.publisherDetails = publisherDetails;
    }

    public Example withPublisherDetails(PublisherDetails publisherDetails) {
        this.publisherDetails = publisherDetails;
        return this;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public Example withBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
        return this;
    }

    public List<RelatedBook> getRelatedBooks() {
        return relatedBooks;
    }

    public void setRelatedBooks(List<RelatedBook> relatedBooks) {
        this.relatedBooks = relatedBooks;
    }

    public Example withRelatedBooks(List<RelatedBook> relatedBooks) {
        this.relatedBooks = relatedBooks;
        return this;
    }

}
