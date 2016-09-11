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
                return new FoodFragment();
            case 2:
                return new PlaceFragment();
            case 3:
                return new TraditionalFragment();
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
                return "Food";
            case 2:
                return "Places";
            case 3:
                return "Traditional";
            default:
                return super.getPageTitle(position);
        }

    }
}
