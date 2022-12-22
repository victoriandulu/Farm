package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.login.Adapters.RecyclerViewAdapter;
import com.example.login.Models.ProductsModel;

import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<ProductsModel>productsModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        recyclerView = findViewById(R.id.Farmrec);
        productsModels=new ArrayList<>();

        productsModels.add(new ProductsModel(R.drawable.kales,"kales"));
        productsModels.add(new ProductsModel(R.drawable.beans,"beans"));
        productsModels.add(new ProductsModel(R.drawable.fruits,"fruits"));
        productsModels.add(new ProductsModel(R.drawable.maize,"maize"));
        productsModels.add(new ProductsModel(R.drawable.wheat,"wheat"));
        productsModels.add(new ProductsModel(R.drawable.pumpkins,"pumpkins"));

        recyclerViewAdapter = new RecyclerViewAdapter(this, productsModels,this);
        recyclerView.setAdapter(recyclerViewAdapter);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);

    }
}