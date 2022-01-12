package com.Pranav.aelmachinetest.retrofit;

import com.Pranav.aelmachinetest.model.BookDetailsRequestModel;
import com.Pranav.aelmachinetest.model.Example;
import com.Pranav.aelmachinetest.model.TopSellingApiRequestModel;
import com.Pranav.aelmachinetest.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("api.php")
    Call<ApiResponse> getBooks(@Body TopSellingApiRequestModel topSellingApiRequestModel);

    @POST("api.php")
    Call<Example> getBookDetails(@Body BookDetailsRequestModel bookDetailsRequestModel);
}
