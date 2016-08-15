package com.example.android.reportcardapp;

/**
 * Created by rohitgupta on 8/14/16.
 */
public class ReportCard {
    // Name of the Student
    private String mVersionName;

    // Grade of the student
    private String mVersionNumber;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new ReportCard object.
    *
    * @param vName is the name of the student
    * @param vNumber is the grade
    * @param image is drawable reference ID that corresponds to the student's picture
    * */
    public ReportCard(String vName, String vNumber, int imageResourceId)
    {
        mVersionName = vName;
        mVersionNumber = vNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the student
     */
    public String getVersionName() {
        return mVersionName;
    }

    /**
     * Get the grade of the student
     */
    public String getVersionNumber() {
        return mVersionNumber;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    @Override
    public String toString() {
        return "ReportCard{" +
                "mVersionName='" + mVersionName + '\'' +
                ", mVersionNumber='" + mVersionNumber + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
