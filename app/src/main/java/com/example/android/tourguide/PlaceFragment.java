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
public class PlaceFragment extends Fragment {


    public PlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<TourInformation> tourInformationList = new ArrayList<>();
        tourInformationList.add(new TourInformation("Bukchon Hanok Village", "A place where visitors can embrace the beauty of traditional Korean houses.", ""));
        tourInformationList.add(new TourInformation("Gyeongbokgung", "Gyeongbokgung was the first royal palace built by the Joseon Dynasty", ""));
        tourInformationList.add(new TourInformation("War Memorial of Korea", "The War Memorial of Korea was established to remember the Korean War", ""));
        tourInformationList.add(new TourInformation("Changdeokgung Palace", "the second grand palace of the Joseon Dynasty, built in 1405 by King Taejong ", ""));
        tourInformationList.add(new TourInformation("Namsangol Hanok Village", "This is a collection of five hanoks (traditional Korean houses) from the Joseon Dynasty", ""));
        tourInformationList.add(new TourInformation("Insadong Course", "Find beautiful antique furniture, paintings, folk art and craft works", ""));
        tourInformationList.add(new TourInformation("Seochon Hanok Village", "a traditional Korean village located to the west of Gyeongbokgung", ""));

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
