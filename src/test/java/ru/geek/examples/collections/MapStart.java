package ru.geek.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapStart {
    public static void main(String[] args) {
        Map<CarModel,String> carModelStringMap = new HashMap<>();

        carModelStringMap.put(new CarModel("vaz"), "amazing");
        carModelStringMap.put(new CarModel("mercedes", 2000), "good");
        carModelStringMap.put(new CarModel("kia"), "wow");

        System.out.println(carModelStringMap.values());
        System.out.println(carModelStringMap.get("vaz"));
        System.out.println(carModelStringMap.containsValue("wow"));

        System.out.println(carModelStringMap);
    }
}
