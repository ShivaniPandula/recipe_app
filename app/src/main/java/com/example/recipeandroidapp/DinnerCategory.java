package com.example.recipeandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DinnerCategory extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DinnerAdapter adapter;
    private List<Dinner> dinnerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinner_category); // Replace with the actual layout name

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewDinner);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize dinnerList
        dinnerList = new ArrayList<>();

        // Add sample dinner items
        dinnerList.add(new Dinner(R.drawable.chicken, "Chicken Curry"));
        dinnerList.add(new Dinner(R.drawable.pasta, "Pasta"));

        // Add more items as needed

        // Initialize adapter
        adapter = new DinnerAdapter(dinnerList, this);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);

//        // Find views by their IDs
//        Button btnAddDinner = findViewById(R.id.btnAddDinner);
//
//        // Set click listener for the "Add" button
//        btnAddDinner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(DinnerCategory.this, RecipeDetails.class);
//                startActivity(intent);
//            }
//        });
//    }
    }
}


