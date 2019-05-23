package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView detailTextView = findViewById(R.id.tv_activity_detail);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent forecastIntent = getIntent();
        if (forecastIntent != null && forecastIntent.hasExtra(Intent.EXTRA_TEXT)) {
            String weatherForecast = forecastIntent.getStringExtra(Intent.EXTRA_TEXT);
            detailTextView.setText(weatherForecast);
        }
    }
}