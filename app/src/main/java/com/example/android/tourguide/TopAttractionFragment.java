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
        tourInformationList.add(new TourInformation(getString(R.string.dongdaemun_market), getString(R.string.dongdaemun_market_desc), R.drawable.dongdaemun));
        tourInformationList.add(new TourInformation(getString(R.string.myeong_dong), getString(R.string.myeong_dong_desc), R.drawable.myeong_dong));
        tourInformationList.add(new TourInformation(getString(R.string.gyeongbokgung_palace), getString(R.string.gyeongbokgung_palace_desc), R.drawable.gyeongbokgung));
        tourInformationList.add(new TourInformation(getString(R.string.n_seoul_tower), getString(R.string.n_seoul_tower_desc), R.drawable.n_seoul_tower));
        tourInformationList.add(new TourInformation(getString(R.string.insadong), getString(R.string.insadong_desc), R.drawable.insadong));
        tourInformationList.add(new TourInformation(getString(R.string.namdaemun_market), getString(R.string.namdaemun_market_desc), R.drawable.namdaemun));
        tourInformationList.add(new TourInformation(getString(R.string.seoul_city_wall), getString(R.string.seoul_city_wall_desc), R.drawable.seoul_city_wall));

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
