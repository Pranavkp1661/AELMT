package com.Pranav.aelmachinetest.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class TopSellingApiRequestModel {


    @SerializedName("target_func")
    private String target_func;
    @SerializedName("type")
    private String type;
    @SerializedName("page")
    private int page;
    @SerializedName("userId")
    private int userId;
    @SerializedName("pubId")
    private String pubId;

    public TopSellingApiRequestModel() {
    }

    public static TopSellingApiRequestModel objectFromData(String str) {

        return new Gson().fromJson(str, TopSellingApiRequestModel.class);
    }

    public String getTarget_func() {
        return target_func;
    }

    public void setTarget_func(String target_func) {
        this.target_func = target_func;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }
}
