package com.Pranav.aelmachinetest.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Pranav.aelmachinetest.R;
import com.Pranav.aelmachinetest.model.RelatedBook;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RelatedBooksAdapter extends RecyclerView.Adapter<RelatedBooksAdapter.ViewHolder> {
    Context context;
    List<RelatedBook> modelList = new ArrayList<>();

    public RelatedBooksAdapter(Context context, List<RelatedBook> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    public void updateAdapter(List<RelatedBook> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_realted_books_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvBookName.setText(modelList.get(position).getName());
        holder.tvUniversityName.setText(modelList.get(position).getPublisherName());
        holder.tvCrossedPrice.setText(modelList.get(position).getOriginalPrice());
        holder.tvPrice.setText(modelList.get(position).getPrice());
        holder.tvCrossedPrice.setPaintFlags(holder.tvCrossedPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        Glide.with(context).load(modelList.get(position).getImagePath()).into(holder.imvBook);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvBookName;
        TextView tvUniversityName;
        TextView tvCrossedPrice;
        TextView tvPrice;
        ImageView imvBook;

        public ViewHolder(@NonNull android.view.View itemView) {
            super(itemView);
            tvBookName = itemView.findViewById(R.id.tvBookName);
            tvUniversityName = itemView.findViewById(R.id.tvUniversityName);
            tvCrossedPrice = itemView.findViewById(R.id.tvCrossedPrice);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            imvBook = itemView.findViewById(R.id.imvBook);

        }
    }
}
