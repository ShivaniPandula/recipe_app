package com.example.recipeandroidapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BreakfastAdapter extends RecyclerView.Adapter<BreakfastAdapter.BreakfastViewHolder> {
    private List<Breakfasts> breakfastList;
    private Context context;
    private OnItemClickListener listener;
    public BreakfastAdapter(List<Breakfasts> breakfastList, Context context, OnItemClickListener listener) {
        this.breakfastList = breakfastList;
        this.context = context;
        this.listener = listener;
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }


    public BreakfastAdapter(List<Breakfasts> breakfastList, Context context) {
        this.breakfastList = breakfastList;
        this.context = context;
    }

    @NonNull
    @Override
    public BreakfastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listlayout, parent, false);
        return new BreakfastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BreakfastViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Breakfasts breakfast = breakfastList.get(position);
        holder.imageView.setImageResource(breakfast.getImageResource());
        holder.textView.setText(breakfast.getBreakfastName());
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
        return breakfastList.size();
    }

    public class BreakfastViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private Button addBTN;
        public BreakfastViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView2);
            addBTN=itemView.findViewById(R.id.addBTN);
        }


    }
}

