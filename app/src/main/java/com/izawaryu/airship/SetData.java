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


    public List<String> setEmpennageFeatures () {

        String[] features = {
                "Control Surfaces",
                "Fore/Aft Location",
                "Stabilizers"
        };

        List<String> empennageFeatures = new ArrayList<String>(Arrays.asList(features));
        return empennageFeatures;
    };

    public List<String> setEngineFeatures () {

        String[] features = {
                "Blades",
                "Count",
                "Location",
                "Manufacturer",
                "Propulsion Type"
        };

        List<String> engineFeatures = new ArrayList<String>(Arrays.asList(features));
        return engineFeatures;
    };

    public List<String> setFuselageFeatures () {

        String[] features = {
                "Aisle Count",
                "Ducting",
                "Monocoque/Semi-monocoque",
                "Open Cockpit",
                "Single/Multi Fuselage",
                "Single/Multi Level"
        };

        List<String> fuselageFeatures = new ArrayList<String>(Arrays.asList(features));
        return fuselageFeatures;
    };

    public List<String> setNoseFeatures () {

        String[] features = {
                "Ducting",
                "Cowling",
                "Engine",
                "Radome",
                "Turret"
        };

        List<String> noseFeatures = new ArrayList<String>(Arrays.asList(features));
        return noseFeatures;
    };

    public List<String> setUndercarriageFeatures () {

        String[] features = {
                "Count",
                "Configuration",
                "Fixed/Retractable"
        };

        List<String> undercarriageFeatures = new ArrayList<String>(Arrays.asList(features));
        return undercarriageFeatures;
    };

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


