package com.Pranav.aelmachinetest;

import com.Pranav.aelmachinetest.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("api.php")
    Call<ApiResponse> getBooks(@Body TopSellingApiRequestModel topSellingApiRequestModel);
}
