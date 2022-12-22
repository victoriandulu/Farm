package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.login.Adapters.RecyclerViewAdapterAnm;
import com.example.login.Adapters.RecyclerViewAdapterWrk;
import com.example.login.Models.ProductsModelAnm;
import com.example.login.Models.ProductsModelWrk;

import java.util.ArrayList;

public class WorkersActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    RecyclerViewAdapterWrk recyclerViewAdapterwrk;
    ArrayList<ProductsModelWrk> productsModelWrk;
    private Object ProductsModelWrk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers);
        recyclerView = findViewById(R.id.Workerec);
        productsModelWrk=new ArrayList<>();

        productsModelWrk.add(new ProductsModelWrk(R.drawable.fruitsfarm, "Fruits Works"));
        productsModelWrk.add(new ProductsModelWrk(R.drawable.haversting, "workers"));
        productsModelWrk.add(new ProductsModelWrk(R.drawable.hens, "Chicken Workers "));
        productsModelWrk.add(new ProductsModelWrk(R.drawable.plantation, "Plantation Workers"));
        productsModelWrk.add(new ProductsModelWrk(R.drawable.cows, "Dairy Workers"));
        productsModelWrk.add(new ProductsModelWrk(R.drawable.goats, " Workers"));

        RecyclerViewAdapterAnm recyclerViewAdapterWrk = new RecyclerViewAdapterAnm(this, productsModelWrk , this);
        recyclerView.setAdapter(recyclerViewAdapterWrk);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
    }
}