package com.example.android.tourguidenano;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    public TourAdapter(Activity context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tour currentTour = getItem(position);

        // Find the TextView in the list_item.xml layout
        TextView heading = listItemView.findViewById(R.id.heading_text_view);
        // set this text
        heading.setText((currentTour).getTourHeading());

        // Find the TextView in the list_item.xml layout
        TextView subHeading = listItemView.findViewById(R.id.subHeading_text_view);
        // set this text o
        subHeading.setText((currentTour).getTourSubHeading());

        // Find the ImageView in the list_item.xml
        ImageView imageView =  listItemView.findViewById(R.id.image_view);

        imageView.setVisibility(View.VISIBLE);
        // set the image
        if (currentTour.hasImage()) {
            imageView.setImageResource(currentTour.getImageResourceId());
        }else {
            imageView.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}