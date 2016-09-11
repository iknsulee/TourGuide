package com.example.android.tourguide;


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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<TourInformation> tourInformationList = new ArrayList<>();
        tourInformationList.add(new TourInformation("Ddeokbokki", "Ddeokbokki is a popular Korean street snack made from soft rice cake", ""));
        tourInformationList.add(new TourInformation("Samgyupsal", "Samgyupsal consist of thick slices of seasoned or unseasoned pork belly meat", ""));
        tourInformationList.add(new TourInformation("BIBIMBAP", "Bibimbap normally consists of rice topped with various vegetables ", ""));
        tourInformationList.add(new TourInformation("KIMBAP", "it is a simple Korean seaweed rice roll with various ingredients inside", ""));
        tourInformationList.add(new TourInformation("SUNDUBU JJIGAE", "Warm spicy stew consists of uncurdled tofu with various vegetables ", ""));
        tourInformationList.add(new TourInformation("ODENG", "Odeng is Korean fish cake that is normally cooked in hot warm savory broth", ""));
        tourInformationList.add(new TourInformation("JAPCHAE", "it is a common fried noodle dish in Korea made from sweet potato noodle", ""));

        // Create a TourInformationAdapter, whose data source is a list of TourInformation. The
        // adapter knows how to create list items for each item in the list.
        TourInformationAdapter tourInformationAdapter =
                new TourInformationAdapter(
                        getActivity(),
                        tourInformationList,
                        R.color.category_phrases
                );

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the TourInformationAdapter we created above, so that the ListView
        // will display list items for each TourInformation in the list.
        listView.setAdapter(tourInformationAdapter);

        return rootView;
    }

}
