package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TopAttractionFragment();
            case 1:
                return new PublicPlaceFragment();
            case 2:
                return new EventFragment();
            case 3:
                return new RestaurantFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Top";
            case 1:
                return "Places";
            case 2:
                return "Events";
            case 3:
                return "Restaurants";
            default:
                return super.getPageTitle(position);
        }

    }
}
