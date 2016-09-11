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
public class TopAttractionFragment extends Fragment {


    public TopAttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<TourInformation> tourInformationList = new ArrayList<>();
        tourInformationList.add(new TourInformation("Dongdaemun Market", "A huge shopping district where you can find almost anything!", "", R.drawable.dongdaemun));
        tourInformationList.add(new TourInformation("Myeong-dong", "Seoul's shopping mecca filled with beauty outlets, street stalls, and more", "", R.drawable.myeong_dong));
        tourInformationList.add(new TourInformation("Gyeongbokgung Palace", "The first royal palace built during the Joseon dynasty", "", R.drawable.gyeongbokgung));
        tourInformationList.add(new TourInformation("N Seoul Tower", "One of the most popular ways to see Seoul's skyline", "", R.drawable.n_seoul_tower));
        tourInformationList.add(new TourInformation("Insa-dong", "Experience Korea's traditional charm through food and shopping", "", R.drawable.insadong));
        tourInformationList.add(new TourInformation("Namdaemun Market", "The largest traditional market in Korea with over 10,000 stores", "", R.drawable.namdaemun));
        tourInformationList.add(new TourInformation("Seoul City Wall", "Once used as a fortress in the past, it is now a scenic way to explore the city", "", R.drawable.seoul_city_wall));

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
