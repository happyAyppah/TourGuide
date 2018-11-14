package com.example.android.tourguidenano;


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
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.eat_one, R.string.eat_one_add));
        tours.add(new Tour(R.string.eat_two, R.string.eat_two_add));
        tours.add(new Tour(R.string.eat_three, R.string.eat_three_add));
        tours.add(new Tour(R.string.eat_four, R.string.eat_four_add));
        tours.add(new Tour(R.string.eat_five, R.string.eat_five_add));
        tours.add(new Tour(R.string.eat_six, R.string.eat_six_add));
        tours.add(new Tour(R.string.eat_seven, R.string.eat_seven_add));
        tours.add(new Tour(R.string.eat_eight, R.string.eat_eight_add));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
