package com.apk2try.punetourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TourGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guide);

        // Find the View that shows the Restaurant category
        TextView restaurant = (TextView) findViewById(R.id.Restaurants);

        // Set a click listener on that View
        restaurant.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Restaurants Activity}
                Intent restaurantIntent = new Intent(TourGuide.this, Restaurant.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });

        // Find the View that shows the mall category
        TextView mall = (TextView) findViewById(R.id.Malls);

        // Set a click listener on that View
        mall.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Malls category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Malls Activity}
                Intent mallIntent = new Intent(TourGuide.this, Malls.class);

                // Start the new activity
                startActivity(mallIntent);
            }
        });

        // Find the View that shows the Historic Places category
        TextView historicPlaces = (TextView) findViewById(R.id.HistoricPlaces);

        // Set a click listener on that View
        historicPlaces.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Historic Places category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Historic Places Activity}
                Intent historicPlacesIntent = new Intent(TourGuide.this, HistoricPlaces.class);

                // Start the new activity
                startActivity(historicPlacesIntent);
            }
        });

        // Find the View that shows the HillStations category
        TextView hillStations = (TextView) findViewById(R.id.HillStation);

        // Set a click listener on that View
        hillStations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the HillStation category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HillStation Activity}
                Intent hillStationIntent = new Intent(TourGuide.this, HillStation.class);

                // Start the new activity
                startActivity(hillStationIntent);
            }
        });
    }
}
