package com.example.recipeandroidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DinnerAdapter extends RecyclerView.Adapter<DinnerAdapter.DinnerViewHolder> {
    private List<Dinner> dinnerList;
    private Context context;

    public DinnerAdapter(List<Dinner> dinnerList, Context context) {
        this.dinnerList = dinnerList;
        this.context = context;
    }

    @NonNull
    @Override
    public DinnerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listlayout, parent, false);
        return new DinnerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DinnerViewHolder holder, int position) {
        Dinner dinner = dinnerList.get(position);
        holder.bind(dinner);
    }

    @Override
    public int getItemCount() {
        return dinnerList.size();
    }

    public class DinnerViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public DinnerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView2);
        }

        public void bind(Dinner dinner) {
            imageView.setImageResource(dinner.getImageResource());
            textView.setText(dinner.getDinnerName());
        }
    }
}

