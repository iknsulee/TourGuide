package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TourInformationAdapter extends ArrayAdapter<TourInformation> {

    /***
     * Resource ID for the background color for this list of tour information
     */
    private int colorResourceId;

    /***
     * Create a new TourInformationAdapter object
     *
     * @param context             is the current context (i.e Activity) that adapter is being created in.
     * @param tourInformationList is the list of TourInformation to be displayed.
     * @param colorResourceId     is the resource ID for the background color for this list of tour information.
     */
    public TourInformationAdapter(Context context, List<TourInformation> tourInformationList, int colorResourceId) {
        super(context, 0, tourInformationList);
        this.colorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tour_list_item, parent, false);
        }

        // Get the TourInformation object located at this position in the list
        TourInformation currentTourInformation = getItem(position);

        // Find the TextView in the tour_list_item.xml layout with the ID tour_title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.tour_title);
        // Get the tour title from the currentTourInformation object and set this text on the title TextView
        titleTextView.setText(currentTourInformation.getTitle());

        // Find the TextView in the tour_list_item.xml layout with the ID tour_description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.tour_description);
        // Get the tour description from the currentTourInformation object and set this text on the description TextView
        descriptionTextView.setText(currentTourInformation.getDescription());

        // Find the ImageView in the tour_list_item.xml layout with the ID tour_image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.tour_image);
        // Check if an image is provided for this tour or not
        if (currentTourInformation.hasImage()) {
            // If an image is available, display the provied image based on the resource ID
            imageView.setImageResource(currentTourInformation.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView(set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), this.colorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;
    }
}
