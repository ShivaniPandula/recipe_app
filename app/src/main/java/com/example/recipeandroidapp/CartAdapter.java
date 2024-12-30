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

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private List<Breakfasts> breakfastsList; // Change the list type to Breakfasts
    private Context context;

    public CartAdapter(List<Breakfasts> breakfastsList, Context context) {
        this.breakfastsList = breakfastsList;
        this.context = context;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cart, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        Breakfasts breakfast = breakfastsList.get(position); // Get Breakfasts object from the list
        // Convert Breakfasts object to CartModel object
        CartModel cartItem = new CartModel(breakfast.getImageResource(), breakfast.getBreakfastName());
        // Bind data to views
        holder.imageView.setImageResource(cartItem.getImageResource());
        holder.textView.setText(cartItem.getItemName());
    }

    @Override
    public int getItemCount() {
        return breakfastsList.size(); // Return size of Breakfasts list
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView2);
        }
    }
}
