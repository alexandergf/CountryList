package com.example.alexandergf.countrylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryListActivity extends AppCompatActivity {

    private RecyclerView country_list_view;
    private List<String> countries;
    private CountryListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        String[] countries_array = getResources().getStringArray(R.array.countries);
        countries = Arrays.asList(countries_array);

        country_list_view = findViewById(R.id.country_list_view);
        country_list_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CountryListAdapter(this, countries);
        country_list_view.setAdapter(adapter);

        country_list_view.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        adapter.setOnClickListener(new CountryListAdapter.OnClickListener() {
            @Override
            public void onClick(int position) {
                //Donem el resultat a la activitat que ens hagi cridat.
                String country =countries.get(position);
                Intent data = new Intent();
                data.putExtra("country",country);
                setResult(RESULT_OK,data);
                finish();
            }
        });
    }
}
