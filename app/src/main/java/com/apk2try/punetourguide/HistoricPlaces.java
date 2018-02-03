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

        // Create a list of Items
        final ArrayList<ItemList> listItem = new ArrayList<ItemList>();
        listItem.add(new ItemList(getString(R.string.HistoricPlace1),getString(R.string.HistoricPlace1Add),R.drawable.pune));
        listItem.add(new ItemList(getString(R.string.HistoricPlace2),getString(R.string.HistoricPlace2Add),R.drawable.katraj));
        listItem.add(new ItemList(getString(R.string.HistoricPlace3),getString(R.string.HistoricPlace3Add),R.drawable.shingad));
        listItem.add(new ItemList(getString(R.string.HistoricPlace4),getString(R.string.HistoricPlace4Add),R.drawable.agakhanpalace));

        ListAdapter adapter = new ListAdapter(this, listItem,R.color.category_historic_places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
