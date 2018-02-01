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
        listItem.add(new ItemList("Amanora Mall Town Centre", "Hadapsar- Kharadi Bypass"));
        listItem.add(new ItemList("Seasons Mall", "Magarpatta Police Station Road"));
        listItem.add(new ItemList("Kumar Pacific Mall", "Shankar Sheth Road"));
        listItem.add(new ItemList("Phoenix Marketcity", "Pune Nagar Road"));

        ListAdapter adapter = new ListAdapter(this, listItem,R.color.category_malls);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
