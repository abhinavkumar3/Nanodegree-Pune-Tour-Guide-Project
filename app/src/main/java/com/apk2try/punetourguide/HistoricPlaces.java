package com.apk2try.punetourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of words
        final ArrayList<ItemList> listItem = new ArrayList<ItemList>();
        listItem.add(new ItemList("Shaniwar Wada Fort", "Mundwa"));
        listItem.add(new ItemList("Katraj Lake", "Katraj Vasahat, Katraj"));
        listItem.add(new ItemList("Sinhagad", "Sinhagad Ghat Road"));
        listItem.add(new ItemList("Aga Khan Palace", "Pune Nagar Road"));

        ListAdapter adapter = new ListAdapter(this, listItem,R.color.category_historic_places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
