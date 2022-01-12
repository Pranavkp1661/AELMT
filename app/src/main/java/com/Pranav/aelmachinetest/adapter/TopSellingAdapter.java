package com.Pranav.aelmachinetest.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Pranav.aelmachinetest.R;
import com.Pranav.aelmachinetest.activity.BookDetailsActivity;
import com.Pranav.aelmachinetest.model.TopSellingApiResponseModel;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class TopSellingAdapter extends RecyclerView.Adapter<TopSellingAdapter.ViewHolder> {
    Context context;
    List<TopSellingApiResponseModel> modelList = new ArrayList<>();

    public TopSellingAdapter(Context context, List<TopSellingApiResponseModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }
    public void UpdateAdapter(List<TopSellingApiResponseModel> modelList){
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_books_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvUniversityName.setText(modelList.get(position).getUniversityName());
        holder.tvBookName.setText(modelList.get(position).getName());
        if(modelList.get(position).getPrice()==0){
            holder.tvCrossedPrice.setVisibility(View.GONE);
            holder.tvPrice.setText("FREE");
        }else{
            holder.tvPrice.setText(modelList.get(position).getPrice()+"");
            holder.tvCrossedPrice.setText(modelList.get(position).getCrossPrice()+"");
            holder.tvCrossedPrice.setPaintFlags(holder.tvCrossedPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        Glide.with(context).load(modelList.get(position).getImage_path()).into(holder.imvBook);
        holder.llItem.setOnClickListener(v -> {
            Intent intent=new Intent(context, BookDetailsActivity.class);
            intent.putExtra("id",modelList.get(position).getId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imvBook;
        TextView tvUniversityName;
        TextView tvCrossedPrice;
        TextView tvPrice;
        TextView tvBookName;
        LinearLayout llItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imvBook = itemView.findViewById(R.id.imvBook);
            tvUniversityName = itemView.findViewById(R.id.tvUniversityName);
            tvCrossedPrice = itemView.findViewById(R.id.tvCrossedPrice);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvBookName=itemView.findViewById(R.id.tvBookName);
            llItem=itemView.findViewById(R.id.llItem);
        }
    }
}
