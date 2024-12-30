package com.example.recipeandroidapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DessertAdapter extends RecyclerView.Adapter<DessertAdapter.DessertViewHolder> {

    private List<Dessert> dessertList;
    private Context context;
    private OnItemClickListener listener;

    public DessertAdapter(List<Dessert> dessertList, Context context, OnItemClickListener listener) {
        this.dessertList = dessertList;
        this.context = context;
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    @NonNull
    @Override
    public DessertViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listlayout, parent, false);
        return new DessertViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DessertViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Dessert dessert = dessertList.get(position);
        holder.imageView.setImageResource(dessert.getImageResource());
        holder.textView.setText(dessert.getDessertName());
        holder.addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.addBTN.setText("Added");
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dessertList.size();
    }

    public class DessertViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private Button addBTN;

        public DessertViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView2);
            addBTN = itemView.findViewById(R.id.addBTN);
        }
    }
}
