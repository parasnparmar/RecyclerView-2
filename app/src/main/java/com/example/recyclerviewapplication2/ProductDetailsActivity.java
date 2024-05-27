package com.example.recyclerviewapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetailsActivity extends AppCompatActivity {
    ImageView imgProduct;
    TextView txtTitle,txtPrice;
    int id,price,imageId;
    String title;
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        initViews();
        extractData();

    }
    private void initViews() {
        imgProduct = findViewById(R.id.imgProduct);
        txtTitle = findViewById(R.id.txttitle);
        txtPrice = findViewById(R.id.txtPrice);
    }
    private void extractData(){
        Intent intent = getIntent();
    Bundle bundle =  intent.getExtras();
    product = (Product) bundle.get("product");
   // id=product.getId();
    title=product.getTxtTitle();
    price = product.getPrice();

    txtPrice.setText(""+price);
    txtTitle.setText(title);



      //  id=intent.getIntExtra("id",10);
       //title= intent.getStringExtra("title");
       //price = intent.getIntExtra("price",1);
       //imageId = intent.getIntExtra("image",11);



    }
}