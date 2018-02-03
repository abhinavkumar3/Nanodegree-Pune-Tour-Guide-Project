package com.apk2try.punetourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of words
        final ArrayList<ItemList> listItem = new ArrayList<ItemList>();
        listItem.add(new ItemList(getString(R.string.Malls1),getString(R.string.Malls1Add),R.drawable.amanora));
        listItem.add(new ItemList(getString(R.string.Malls2),getString(R.string.Malls2Add),R.drawable.seasons));
        listItem.add(new ItemList(getString(R.string.Malls3),getString(R.string.Malls3Add),R.drawable.kumar));
        listItem.add(new ItemList(getString(R.string.Malls4),getString(R.string.Malls4Add),R.drawable.mall));

        ListAdapter adapter = new ListAdapter(this, listItem,R.color.category_malls);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
