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
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.hot_one, R.string.hot_one_add));
        tours.add(new Tour(R.string.hot_two, R.string.hot_two_add));
        tours.add(new Tour(R.string.hot_three, R.string.hot_three_add));
        tours.add(new Tour(R.string.hot_four, R.string.hot_four_add));
        tours.add(new Tour(R.string.hot_five, R.string.hot_five_add));
        tours.add(new Tour(R.string.hot_six, R.string.hot_six_add));
        tours.add(new Tour(R.string.hot_seven, R.string.hot_seven_add));
        tours.add(new Tour(R.string.hot_eight, R.string.hot_eight_add));
        tours.add(new Tour(R.string.hot_nine, R.string.hot_nine_add));
        tours.add(new Tour(R.string.hot_ten, R.string.hot_ten_add));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
