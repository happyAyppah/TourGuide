package com.example.android.tourguidenano;

public class Tour {


    private int TourHeading;

    private int TourSubHeading;

    private int ImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    public Tour(int tourHeading, int tourSubHeading) {
        TourHeading = tourHeading;
        TourSubHeading = tourSubHeading;
    }


    public Tour(int tourHeading, int tourSubHeading, int imageResourceId) {
        TourHeading = tourHeading;
        TourSubHeading = tourSubHeading;
        ImageResourceId = imageResourceId;
    }




    public int getTourHeading() {
        return TourHeading;
    }

    public int getTourSubHeading() {
        return TourSubHeading;
    }

    public int getImageResourceId(){
        return ImageResourceId;
    }

    public boolean hasImage(){
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }



}



