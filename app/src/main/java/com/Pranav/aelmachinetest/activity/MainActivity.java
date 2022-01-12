package com.Pranav.aelmachinetest.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Pranav.aelmachinetest.R;
import com.Pranav.aelmachinetest.adapter.TopSellingAdapter;
import com.Pranav.aelmachinetest.model.ApiResponse;
import com.Pranav.aelmachinetest.model.TopSellingApiRequestModel;
import com.Pranav.aelmachinetest.model.TopSellingApiResponseModel;
import com.Pranav.aelmachinetest.retrofit.ApiInterface;
import com.Pranav.aelmachinetest.retrofit.RetrofitClientApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TopSellingApiRequestModel topSellingApiRequestModel;
    Context context;
    RecyclerView rvTopSelling;
    TopSellingAdapter topSellingAdapter;
    List<TopSellingApiResponseModel> topSellingApiResponseModels=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        rvTopSelling=findViewById(R.id.rvTopSelling);
        topSellingAdapter=new TopSellingAdapter(context,topSellingApiResponseModels);
        rvTopSelling.setLayoutManager(new GridLayoutManager(context,2));
        rvTopSelling.setAdapter(topSellingAdapter);
        topSellingApiRequestModel = new TopSellingApiRequestModel();
        topSellingApiRequestModel.setTarget_func("searchContent");
        topSellingApiRequestModel.setType("top_selling");
        topSellingApiRequestModel.setPage(1);
        topSellingApiRequestModel.setUserId(192277);
        topSellingApiRequestModel.setPubId("");
        getBooks(topSellingApiRequestModel);
    }

    private void getBooks(TopSellingApiRequestModel topSellingApiRequestModel) {
        ApiInterface apiInterface = RetrofitClientApi.getClient().create(ApiInterface.class);
        Call<ApiResponse> call = apiInterface.getBooks(topSellingApiRequestModel);
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.e("onResponse: ", "success" + response.body().getOutput().getResult().getTopSellingApiResponseModels().toString());
                topSellingAdapter.UpdateAdapter(response.body().getOutput().getResult().getTopSellingApiResponseModels());
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("onFailure: ", "error"+t);
            }
        });
    }
}