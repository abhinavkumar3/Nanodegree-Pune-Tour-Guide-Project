package com.apk2try.punetourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.graphics.Color.BLACK;

/**
 * Created by AKUMAR63 on 1/30/2018.
 */

public class ListAdapter extends ArrayAdapter<ItemList> {

    /** Resource ID for the background color for this list of words */
     private int mColorResourceId;

    public ListAdapter(Activity context, ArrayList<ItemList> listItem, int colorResourceId) {
            super(context, 0, listItem);
        mColorResourceId=colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        ItemList currentItem = getItem(position);

        //Set the Place Name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        nameTextView.setText(currentItem.getplaceName());

        // Set the location Name
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentItem.getlocationPlace());

        //Setting background color
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
