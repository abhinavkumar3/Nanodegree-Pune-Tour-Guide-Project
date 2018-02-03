package com.apk2try.punetourguide;

/**
 * Created by AKUMAR63 on 1/30/2018.
 */

public class ItemList {

    /** Name of the Place */
    private  String mplaceName;

    /**Location of Place*/
    private String mlocationPlace;

    /**Name of Picture to be displayed*/
    private int mPictureResourceId;

    /**
     * Create a new List of Items object.
     *
     * @param placeName Name of the Place
     * @param locationPlace is the location or Address of Place
     * @param PictureResourceId is the picture of location
     */

    public ItemList(String placeName, String locationPlace,int PictureResourceId) {
                mlocationPlace = locationPlace;
                mplaceName = placeName;
                mPictureResourceId = PictureResourceId;
    }

    /**
     * Get the Name of Place
     */
    public String getplaceName() {
        return mplaceName;
    }


    /**
     *    Return the audio resource ID of the word.
     */

    public int getPictureResourceId() { return mPictureResourceId; }

    /**
     * Get the Address of the Place.
     */
    public String getlocationPlace() {
        return mlocationPlace;
    }

    @Override
    public String toString() {
        return "ItemList{" +
                "mplaceName='" + mplaceName + '\'' +
                ", mlocationPlace='" + mlocationPlace + '\'' +
                ", mPictureResourceId='" + mPictureResourceId + '\'' +
                '}';
    }
}
