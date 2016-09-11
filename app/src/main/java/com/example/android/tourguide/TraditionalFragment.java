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
public class TraditionalFragment extends Fragment {


    public TraditionalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<TourInformation> tourInformationList = new ArrayList<>();
        tourInformationList.add(new TourInformation("Traditional Craft Making", "Use your own two hands to make traditional handicraft items that were used in the past.", ""));
        tourInformationList.add(new TourInformation("Traditional Music", "Full of passion and spirit, Korean traditional music captivates its listeners.", ""));
        tourInformationList.add(new TourInformation("Traditional Food", "Have yourself a proper Korean dining experience.", ""));
        tourInformationList.add(new TourInformation("Traditional Sports", "See the passion and dedication that goes into Korean martial arts.", ""));
        tourInformationList.add(new TourInformation("Traditional Games", "Learn how folks from ancient Korean history bonded and kept themselves entertained.", ""));
        tourInformationList.add(new TourInformation("Traditional Dancing", "Beautiful and graceful performances with a rich history.", ""));
        tourInformationList.add(new TourInformation("Temple Stay", "The Temple stay program not only brings you closer to nature, but also to yourself.", ""));

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
