package com.example.java8feactuesex;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScreenResolution {
    private int width;
    private int height;
}
@Data
@AllArgsConstructor
class DisplayFeatures {
    private String size; // In inches
    private ScreenResolution resolution;
}
@Data
@AllArgsConstructor
class Mobile {
    private long id;
    private String brand;
    private String name;
    private DisplayFeatures displayFeatures;
}
class MobileService {

    public int getMobileScreenWidth(Mobile mobile){

        if(mobile != null){
            DisplayFeatures dfeatures = mobile.getDisplayFeatures();
            if(dfeatures != null){
                ScreenResolution resolution = dfeatures.getResolution();
                if(resolution != null){
                    return resolution.getWidth();
                }
            }
        }
        return 0;

    }

}