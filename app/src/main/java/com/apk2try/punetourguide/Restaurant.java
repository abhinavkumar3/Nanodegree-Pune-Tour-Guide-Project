package com.apk2try.punetourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of words
        final ArrayList<ItemList> listItem = new ArrayList<ItemList>();
        listItem.add(new ItemList("Vaishali", "FC Road"));
        listItem.add(new ItemList("Falahar", "FC Road"));
        listItem.add(new ItemList("German Bakery", "Koregaon Park"));
        listItem.add(new ItemList("Waffles", "Viman Nagar"));

        ListAdapter adapter = new ListAdapter(this, listItem,R.color.category_restaurant);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
