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
public class LocationFragment extends Fragment {


    public LocationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.loc_one , R.string.loc_one_add , R.drawable.akshardham_temple));
        tours.add(new Tour(R.string.loc_two, R.string.loc_two_add, R.drawable.humayun_tomb));
        tours.add(new Tour(R.string.loc_three, R.string.loc_three_add, R.drawable.india_gate));
        tours.add(new Tour(R.string.loc_four, R.string.loc_four_add, R.drawable.jantar_mantar));
        tours.add(new Tour(R.string.loc_five, R.string.loc_five_add, R.drawable.lodi_gadern));
        tours.add(new Tour(R.string.loc_six, R.string.loc_six_add, R.drawable.lotus_temple));
        tours.add(new Tour(R.string.loc_seven, R.string.loc_seven_add, R.drawable.parliament_house));
        tours.add(new Tour(R.string.loc_eight, R.string.loc_eight_add, R.drawable.rashtrapati_bhavan));
        tours.add(new Tour(R.string.loc_nine, R.string.loc_nine_add, R.drawable.red_fort));
        tours.add(new Tour(R.string.loc_ten, R.string.loc_ten_add, R.drawable.qutub_minar));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
