package ru.geek.examples.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetStart {
    public static void main(String[] args) {
        Set<CarModel> carModelSet = new HashSet<>();
        Set<CarModel> carModelSet1 = new HashSet<>();

        CarModel[] carModels = {new CarModel("audi"), new CarModel("vegas")};

        carModelSet.addAll(Arrays.asList(new CarModel("zaporozhec")));
        carModelSet.addAll(Arrays.asList(carModels));

        carModelSet1.add(new CarModel("vaz"));
        carModelSet1.add(new CarModel("bmw"));

        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("mercedes"));
        CarModel xss = new CarModel("kia");
        carModelSet.add(xss);
        carModelSet.add(new CarModel("mercedes"));
        carModelSet.add(new CarModel("mercedes"));
        carModelSet.add(new CarModel("mercedes"));
        carModelSet.add(new CarModel("mercedes"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));

//        carModelSet.retainAll(carModelSet1);

        for (CarModel carModel :carModelSet){
            System.out.println(carModel.toString());
        }
    }
}
