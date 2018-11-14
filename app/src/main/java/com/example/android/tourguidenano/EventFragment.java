package com.example.android.tourguidenano;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.event_one, R.string.event_one_loc));
        tours.add(new Tour(R.string.event_two, R.string.event_two_loc));
        tours.add(new Tour(R.string.event_three, R.string.event_three_loc));
        tours.add(new Tour(R.string.event_four, R.string.event_four_loc));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
