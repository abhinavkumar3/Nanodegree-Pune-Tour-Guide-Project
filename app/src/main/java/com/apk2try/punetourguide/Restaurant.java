package com.apk2try.punetourguide;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of words
        final ArrayList<ItemList> listItem = new ArrayList<ItemList>();
        listItem.add(new ItemList(getString(R.string.Restaturant1), getString(R.string.Restaturant1Add),R.drawable.vaishali));
        listItem.add(new ItemList(getString(R.string.Restaturant2), getString(R.string.Restaturant2Add),R.drawable.falahar));
        listItem.add(new ItemList(getString(R.string.Restaturant3), getString(R.string.Restaturant3Add),R.drawable.germanbakery));
        listItem.add(new ItemList(getString(R.string.Restaturant4), getString(R.string.Restaturant4Add),R.drawable.waffles));

        ListAdapter adapter = new ListAdapter(this, listItem,R.color.category_restaurant);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
