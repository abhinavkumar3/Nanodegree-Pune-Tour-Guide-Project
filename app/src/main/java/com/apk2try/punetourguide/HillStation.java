package com.apk2try.punetourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HillStation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of Items
        final ArrayList<ItemList> listItem = new ArrayList<ItemList>();
        listItem.add(new ItemList(getString(R.string.HillStations1),getString(R.string.HistoricPlace1Add),R.drawable.lonvala));
        listItem.add(new ItemList(getString(R.string.HillStations2),getString(R.string.HillStations2Add),R.drawable.khandala));
        listItem.add(new ItemList(getString(R.string.HillStations3),getString(R.string.HillStations3Add),R.drawable.panchgani));
        listItem.add(new ItemList(getString(R.string.HillStations4),getString(R.string.HillStations4Add),R.drawable.malshejghat));

        ListAdapter adapter = new ListAdapter(this, listItem,R.color.category_hillStations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
