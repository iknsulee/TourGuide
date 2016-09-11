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
public class TraditionalFragment extends Fragment {


    public TraditionalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<TourInformation> tourInformationList = new ArrayList<>();
        tourInformationList.add(new TourInformation(getString(R.string.traditional_craft_making), getString(R.string.traditional_craft_making_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.traditional_music), getString(R.string.traditional_music_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.traditional_food), getString(R.string.traditional_food_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.traditional_sports), getString(R.string.traditional_sports_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.traditional_games), getString(R.string.traditional_games_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.traditional_dancing), getString(R.string.traditional_dancing_desc)));
        tourInformationList.add(new TourInformation(getString(R.string.temple_stay), getString(R.string.temple_stay_desc)));

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
