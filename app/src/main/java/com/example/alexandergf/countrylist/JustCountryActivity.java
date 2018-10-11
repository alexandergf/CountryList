package com.example.alexandergf.countrylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class JustCountryActivity extends AppCompatActivity {

    public static final int CHOOSE_COUNTRY = 0;

    private String country=""; //model

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
                startActivityForResult(intent, CHOOSE_COUNTRY);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode){
            case CHOOSE_COUNTRY:
                if (resultCode==RESULT_OK){
                   country=data.getStringExtra("country");
                   if (country!=null) {
                       country_view.setText(country);
                   }
                }
                break;
            default:
                super.onActivityResult(requestCode, resultCode, data);
                break;
        }


    }
}
