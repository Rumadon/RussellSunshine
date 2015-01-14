package com.example.ilab.sunshine.test;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;

/**
 * Created by Ilab on 1/9/15.
 */
public class FullTestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(FullTestSuite.class)
                .includeAllPackagesUnderHere().build();
    }
    public FullTestSuite(){
        super();
    }

}
/* Inner class that defines the table contents of the location table */
//public static final class LocationEntry implements BaseColumns {
//
//    // Table name
//    public static final String TABLE_NAME = "location";
//
//    // The location setting string is what will be sent to openweathermap
//    // as the location query.
//    public static final String COLUMN_LOCATION_SETTING = "location_setting";
//
//    // Human readable location string, provided by the API.  Because for styling,
//    // "Mountain View" is more recognizable than 94043.
//    public static final String COLUMN_CITY_NAME = "city_name";
//
//    // In order to uniquely pinpoint the location on the map when we launch the
//    // map intent, we store the latitude and longitude as returned by openweathermap.
//    public static final String COLUMN_COORD_LAT = "coord_lat";
//    public static final String COLUMN_COORD_LONG = "coord_long";
//}