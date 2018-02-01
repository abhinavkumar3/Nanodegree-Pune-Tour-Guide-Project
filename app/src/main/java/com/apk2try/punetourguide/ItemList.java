package com.apk2try.punetourguide;

/**
 * Created by AKUMAR63 on 1/30/2018.
 */

public class ItemList {

    /** Name of the Place */
    private  String mplaceName;

    /**Location of Place*/
    private String mlocationPlace;

    /**
     * Create a new List of Items object.
     *
     * @param placeName Name of the Place
     * @param locationPlace is the location or Address of Place
     *
     */

    public ItemList(String placeName, String locationPlace) {
                mlocationPlace = locationPlace;
                mplaceName = placeName;
    }

    /**
     * Get the Name of Place
     */
    public String getplaceName() {
        return mplaceName;
    }

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
                '}';
    }
}
