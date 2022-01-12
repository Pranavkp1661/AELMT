package com.Pranav.aelmachinetest.model;

import com.Pranav.aelmachinetest.TopSellingApiResponseModel;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    @SerializedName("Books")
    private List<TopSellingApiResponseModel> topSellingApiResponseModels;
    public static Result objectFromData(String str) {
        return new Gson().fromJson(str, Result.class);
    }
    public List<TopSellingApiResponseModel> getTopSellingApiResponseModels() {
        return topSellingApiResponseModels;
    }

    public void setTopSellingApiResponseModels(List<TopSellingApiResponseModel> topSellingApiResponseModels) {
        this.topSellingApiResponseModels = topSellingApiResponseModels;
    }
}
