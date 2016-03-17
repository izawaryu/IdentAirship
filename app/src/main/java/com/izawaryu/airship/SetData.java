package com.izawaryu.airship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ryu on 3/6/2016. This is used during development
 * to mimic the various expected data sources. After development,
 * it may gather and supply data from different sources.
 */
public class SetData {
    public static final String LOG_TAG = SetData.class.getSimpleName();


    public List<String> setAirframeParts () {

        String[] parts = {
                "Empennage",
                "Engines",
                "Fuselage",
                "Nose",
                "Undercarriage",
                "Wings"
        };

        List<String> airframeParts = new ArrayList<String>(Arrays.asList(parts));
        return airframeParts;
    }

    public List<String> setWingFeatures () {

        String[] features = {
                "Dihederal",
                "Number",
                "Location",
                "Stagger",
                "Sweep",
                "Swing"
        };

        List<String> wingFeatures = new ArrayList<String>(Arrays.asList(features));
        return wingFeatures;
    };

}


