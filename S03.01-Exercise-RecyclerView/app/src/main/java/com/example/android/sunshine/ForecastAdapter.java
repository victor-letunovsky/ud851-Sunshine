package com.example.android.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// COMPLETED (15) Add a class file called ForecastAdapter
// COMPLETED (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>
public class ForecastAdapter extends Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // COMPLETED (23) Create a private string array called mWeatherData
    private String[] mWeatherData;

    // COMPLETED (47) Create the default constructor (we will pass in parameters in a later lesson)
    public ForecastAdapter() {
    }

    // COMPLETED (24) Override onCreateViewHolder
    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // COMPLETED (25) Within onCreateViewHolder, inflate the list item xml into a view
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View listItemView = inflater.inflate(R.layout.forecast_list_item, viewGroup, false);

        // COMPLETED (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
        return new ForecastAdapterViewHolder(listItemView);
    }

    // COMPLETED (27) Override onBindViewHolder
    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder viewHolder, int i) {
        // COMPLETED (28) Set the text of the TextView to the weather for this list item's position
        viewHolder.setWeatherText(mWeatherData[i]);
    }

    // COMPLETED (29) Override getItemCount
    @Override
    public int getItemCount() {
        // COMPLETED (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
        return (mWeatherData == null) ? 0 : mWeatherData.length;
    }

    // COMPLETED (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        // COMPLETED (32) After you save mWeatherData, call notifyDataSetChanged
        notifyDataSetChanged();
    }

    // COMPLETED (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // COMPLETED (17) Extend RecyclerView.ViewHolder
    class ForecastAdapterViewHolder extends ViewHolder {

        // COMPLETED (18) Create a public final TextView variable called mWeatherTextView
        private final TextView mWeatherTextView;

        // COMPLETED (19) Create a constructor for this class that accepts a View as a parameter
        ForecastAdapterViewHolder(@NonNull View itemView) {
            // COMPLETED (20) Call super(view) within the constructor for ForecastAdapterViewHolder
            super(itemView);

            // COMPLETED (21) Using view.findViewById, get a reference to this layout's TextView
            // and save it to mWeatherTextView
            mWeatherTextView = itemView.findViewById(R.id.tv_weather_data);
        }

        private void setWeatherText(String text) {
            mWeatherTextView.setText(text);
        }
    }
}
