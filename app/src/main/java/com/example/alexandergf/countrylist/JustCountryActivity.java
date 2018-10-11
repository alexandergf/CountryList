package com.example.alexandergf.countrylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JustCountryActivity extends AppCompatActivity {

    private Button btn_choose;
    private TextView country_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_country);

        country_view = findViewById(R.id.country_view);
        btn_choose = findViewById(R.id.btn_choose);

        btn_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(JustCountryActivity.this, CountryListActivity.class);
                startActivity(intent);
            }
        });

    }
}
