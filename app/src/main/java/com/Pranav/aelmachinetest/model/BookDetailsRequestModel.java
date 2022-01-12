package com.Pranav.aelmachinetest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookDetailsRequestModel {
    @SerializedName("functionName")
    @Expose
    private String functionName;
    @SerializedName("bookId")
    @Expose
    private int bookId;
    @SerializedName("userId")
    @Expose
    private int userId;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;

}
}
