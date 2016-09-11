package com.example.android.tourguide;

/**
 * Created by donbosco on 2016-09-09.
 */
public class TourInformation {

    private String title;
    private String description;

    /**
     * Image Resource ID for the tour information
     */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant Value that represents no image was provided for this tour information
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public TourInformation(String title, String description, int imageResourceId) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public TourInformation(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return this.imageResourceId != NO_IMAGE_PROVIDED;
    }
}
