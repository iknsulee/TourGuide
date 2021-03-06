package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        tourInformationList.add(new TourInformation(getString(R.string.ddeokbokki), getString(R.string.ddeokbokki_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.samgyupsal), getString(R.string.samgyupsal_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.bibimbap), getString(R.string.bibimbap_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.kimbap), getString(R.string.kimbap_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.sundubu_jjigae), getString(R.string.sundubu_jjigae_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.odeng), getString(R.string.odeng_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.japchae), getString(R.string.japchae_desc)));

        // Create a TourInformationAdapter, whose data source is a list of TourInformation. The
        // adapter knows how to create list items for each item in the list.
        TourInformationAdapter tourInformationAdapter = new TourInformationAdapter(getActivity(), tourInformationList, R.color.item_background);

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
