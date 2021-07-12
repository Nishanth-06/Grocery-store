package com.groceryStore.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView grocery_staples, oils_and_others, vegitables, eggs;
    private ImageView sugar_and_others, house_hold_items, fruits, personnel_care;
    private ImageView baby_care, sweets_and_icecreams, chocolates, gifts;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        grocery_staples = (ImageView) findViewById(R.id.grocery_staples);
        oils_and_others = (ImageView) findViewById(R.id.oils_and_others);
        vegitables = (ImageView) findViewById(R.id.vegitables);
        eggs = (ImageView) findViewById(R.id.eggs);

        sugar_and_others = (ImageView) findViewById(R.id.sugar_and_others);
        house_hold_items = (ImageView) findViewById(R.id.house_hold_items);
        fruits = (ImageView) findViewById(R.id.fruits);
        personnel_care = (ImageView) findViewById(R.id.personnel_care);

        baby_care = (ImageView) findViewById(R.id.baby_care);
        sweets_and_icecreams = (ImageView) findViewById(R.id.sweets_and_icecreams);
        chocolates = (ImageView) findViewById(R.id.chocolates);
        gifts = (ImageView) findViewById(R.id.gifts);


        grocery_staples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "grocery_staples");
                startActivity(intent);
            }
        });
        oils_and_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "oils_and_others");
                startActivity(intent);
            }
        });


        vegitables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "vegitables");
                startActivity(intent);
            }
        });


        eggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "eggs");
                startActivity(intent);
            }
        });


        sugar_and_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "sugar_and_others");
                startActivity(intent);
            }
        });


        house_hold_items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "house_hold_items");
                startActivity(intent);
            }
        });



        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "fruits");
                startActivity(intent);
            }
        });


        personnel_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "personnel_care");
                startActivity(intent);
            }
        });



        baby_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "baby_care");
                startActivity(intent);
            }
        });


        sweets_and_icecreams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "sweets_and_icecreams");
                startActivity(intent);
            }
        });


        chocolates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "chocolates");
                startActivity(intent);
            }
        });


        gifts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.groceryStore.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "gifts");
                startActivity(intent);
            }
        });
    }
}
