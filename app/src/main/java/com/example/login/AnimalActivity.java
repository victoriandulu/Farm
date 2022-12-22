package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.login.Adapters.RecyclerViewAdapterAnm;
import com.example.login.Models.ProductsModel;
import com.example.login.Models.ProductsModelAnm;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    RecyclerViewAdapterAnm recyclerViewAdapterAnm;
    ArrayList<ProductsModelAnm> productsModelAnms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        recyclerView = findViewById(R.id.Animalrec);
        productsModelAnms=new ArrayList<>();

        productsModelAnms.add(new ProductsModelAnm(R.drawable.beef,"Beef Meat"));
        productsModelAnms.add(new ProductsModelAnm(R.drawable.chicken,"Chicken"));
        productsModelAnms.add(new ProductsModelAnm(R.drawable.fish,"Fish"));
        productsModelAnms.add(new ProductsModelAnm(R.drawable.goat,"Goat"));
        productsModelAnms.add(new ProductsModelAnm(R.drawable.friesian,"friesian"));

        recyclerViewAdapterAnm = new RecyclerViewAdapterAnm(this, productsModelAnms, this);
        recyclerView.setAdapter(recyclerViewAdapterAnm);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
    }
}