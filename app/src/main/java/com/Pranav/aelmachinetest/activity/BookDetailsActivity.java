package com.Pranav.aelmachinetest.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Pranav.aelmachinetest.R;
import com.Pranav.aelmachinetest.adapter.RelatedBooksAdapter;
import com.Pranav.aelmachinetest.model.BookDetailsRequestModel;
import com.Pranav.aelmachinetest.model.Example;
import com.Pranav.aelmachinetest.model.RelatedBook;
import com.Pranav.aelmachinetest.model.TopSellingApiResponseModel;
import com.Pranav.aelmachinetest.retrofit.ApiInterface;
import com.Pranav.aelmachinetest.retrofit.RetrofitClientApi;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookDetailsActivity extends AppCompatActivity {
    Context context;
    BookDetailsRequestModel bookDetailsRequestModel;
    int j;
    TextView tvBookName;
    TextView tvOfferedBy;
    TextView tvCrossedPrice;
    TextView tvPrice;
    TextView tvCourseCode;
    TextView tvAuthor;
    TextView tvUniversity;
    TextView tvRegulation;
    TextView tvCategories;
    TextView tvFormat;
    ImageView imvBookDetails;
    RecyclerView rvRelatedBooks;
    RelatedBooksAdapter relatedBooksAdapter;
    List<RelatedBook> relatedBooks=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_book_details);
        initActivity();
        Intent i = getIntent();
        Bundle b = i.getExtras();

        if (b != null) {
            j = (int) b.get("id");
        }
        bookDetailsRequestModel.setBookId(j);
        bookDetailsRequestModel.setUserId(192277);
        bookDetailsRequestModel.setFunctionName("booksDetails");
        getBookDetails(bookDetailsRequestModel);
        relatedBooksAdapter=new RelatedBooksAdapter(context,relatedBooks);
        rvRelatedBooks.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,true));
        rvRelatedBooks.setAdapter(relatedBooksAdapter);
    }

    private void initActivity() {
        bookDetailsRequestModel = new BookDetailsRequestModel();
        tvBookName = findViewById(R.id.tvBookName);
        tvOfferedBy = findViewById(R.id.tvOfferedBy);
        tvCrossedPrice = findViewById(R.id.tvCrossedPrice);
        tvPrice = findViewById(R.id.tvPrice);
        tvCourseCode = findViewById(R.id.tvCourseCode);
        tvAuthor = findViewById(R.id.tvAuthor);
        tvUniversity = findViewById(R.id.tvUniversity);
        tvRegulation = findViewById(R.id.tvRegulation);
        tvCategories = findViewById(R.id.tvCategories);
        tvFormat = findViewById(R.id.tvFormat);
        imvBookDetails = findViewById(R.id.imvBookDetails);
        rvRelatedBooks=findViewById(R.id.rvRelatedBooks);
    }

    private void getBookDetails(BookDetailsRequestModel bookDetailsRequestModel) {
        ApiInterface apiInterface = RetrofitClientApi.getClient().create(ApiInterface.class);
        Call<Example> call = apiInterface.getBookDetails(bookDetailsRequestModel);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Log.e("onResponse: ", "success " + response.body().getBookInfo());
                tvBookName.setText(response.body().getBookInfo().getName());
                tvOfferedBy.setText(response.body().getBookInfo().getAuthorName());
                Glide.with(context).load(response.body().getBookInfo().getImagePath()).into(imvBookDetails);
                tvCrossedPrice.setText(response.body().getBookInfo().getOriginalPrice());
                tvCrossedPrice.setPaintFlags(tvCrossedPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                tvPrice.setText(response.body().getBookInfo().getPrice());
                tvCourseCode.setText(response.body().getBookInfo().getCourseCode());
                tvAuthor.setText(response.body().getBookInfo().getAuthorName());
                tvUniversity.setText(response.body().getBookInfo().getUniversityName());
                tvRegulation.setText(response.body().getBookInfo().getRegulation());
                tvCategories.setText(response.body().getBookInfo().getCategories());
                relatedBooksAdapter.updateAdapter(response.body().getRelatedBooks());
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.e("onFailure: ", "error" + t);
            }
        });
    }
}