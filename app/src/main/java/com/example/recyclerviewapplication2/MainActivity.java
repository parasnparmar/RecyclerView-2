package com.example.recyclerviewapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView productRecyclerView;
    ArrayList<Product> products;
    ProductsAdapter productsAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initProducts();
        initViews();
    }

    private void initProducts(){
        products = new ArrayList<>();
        for(int i = 0;i<5;i++){
            products.add(new Product(
                    i,
                    "Product" + i,
                    i + 100,
                    i + 10
            ));
        }
    }

    private void initViews(){
        productRecyclerView = findViewById(R.id.productRecyclerView);
        productRecyclerView.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        ));
        productsAdapter = new ProductsAdapter(products);
        productRecyclerView.setAdapter(productsAdapter);
    }
}