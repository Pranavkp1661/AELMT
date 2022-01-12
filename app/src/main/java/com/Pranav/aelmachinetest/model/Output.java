package com.Pranav.aelmachinetest.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Output {
    @SerializedName("Result")
    private Result result;
    public static Output objectFromData(String str) {
        return new Gson().fromJson(str, Output.class);
    }
    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
