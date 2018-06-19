package com.ebook.chapter03.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/*****
 * @Author zean
 * Created at 2018/4/20
 * @Email zxc200706@hotmail.com
 *
 ****/

public class CarFactory {

    private static Map<String, RaceCar> flyweights = new HashMap<>();

    public static RaceCar getRaceCar(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }
        RaceCar raceCar = null;
        switch (key) {
            case "Midget":
                raceCar = new FlyweightMidgetCar("Midget car",140,400);
                break;
            case "Sprint":
                raceCar = new FlyweightSprintCar("Sprint car",160,1000);
                break;
            default:
                throw new IllegalArgumentException("unsupported car type");
        }
        flyweights.put(key,raceCar);
        return  raceCar;
    }
}
