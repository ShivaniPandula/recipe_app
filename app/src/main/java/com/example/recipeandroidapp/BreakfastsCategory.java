package com.example.recipeandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BreakfastsCategory extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BreakfastAdapter adapter,adapter2;
    private List<Breakfasts> breakfastList;
    private List<Breakfasts> selectedList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfasts_category);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewBreakfasts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize breakfastList
        breakfastList = new ArrayList<>();
        selectedList = new ArrayList<>();

        // Add sample breakfast items
        breakfastList.add(new Breakfasts(R.drawable.dosabatter, "DosaBatter"));
        breakfastList.add(new Breakfasts(R.drawable.pasta, "Pasta"));
        //Log.d("list  ", String.valueOf(breakfastList));
        // Add more items as needed
        // Initialize adapter
       // adapter = new BreakfastAdapter(breakfastList, this);

        adapter = new BreakfastAdapter(breakfastList, this, new BreakfastAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                //Breakfasts selected1 = String.valueOf(breakfastList.get(position));
                Log.d("position", String.valueOf(position));
                Log.d("BreakfastList", breakfastList.toString());
                Log.d("dataat", String.valueOf(breakfastList.get(position)));
                Breakfasts selectedBreakfast = breakfastList.get(position);
                selectedList.add(selectedBreakfast);
                Log.d("SelectedList", selectedList.toString());



            }
        });

        //Log.d("Selected Item", String.valueOf(selectedList));

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);

        // Example code for button click listener
        // You can uncomment and customize it as needed

//        // Find views by their IDs
//        ImageView imageBreakfast = findViewById(R.id.imageBreakfast);
//        TextView textBreakfastName = findViewById(R.id.textBreakfastName);
//        Button btnAddBreakfast = findViewById(R.id.btnAddBreakfast);
//
//        // Set click listener for the "Add" button
//        btnAddBreakfast.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(BreakfastsCategory.this, RecipeDetails.class);
//                startActivity(intent);
//            }
//        });

        // Find the submit button
        Button submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("SubmitButton", "Submit button clicked"); // Debug statement
                // Create an intent to start the CartActivity
                Intent intent = new Intent(BreakfastsCategory.this, Cart.class);
                // Put the selectedList as an extra
                intent.putExtra("selectedList", (Serializable) selectedList);
                // Start the CartActivity
                startActivity(intent);
            }
        });

    }
}
