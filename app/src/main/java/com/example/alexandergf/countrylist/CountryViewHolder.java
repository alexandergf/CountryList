package com.example.alexandergf.countrylist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CountryViewHolder extends RecyclerView.ViewHolder{
    private TextView country_view;

    public CountryViewHolder(View itemView, final CountryListAdapter.OnClickListener listener) {
        super(itemView);
        this.country_view = itemView.findViewById(R.id.country_view);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = getAdapterPosition();
                if (listener != null && pos != RecyclerView.NO_POSITION){
                    listener.onClick(pos);
                }
            }
        });
    }

    public void bind(String country){
        this.country_view.setText(country);
    }
}
