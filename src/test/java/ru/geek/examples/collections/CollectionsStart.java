package ru.geek.examples.collections;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsStart {
    public static void main(String[] args) {
        List<CarModel> carModelList = new ArrayList<>();
        carModelList.add(new CarModel("bmw"));
        System.out.println(carModelList.get(0));

        CarModel[] carModelsArray = {new CarModel("123"), new CarModel("321")};
        System.out.println(carModelsArray[0]);

        carModelList.add(new CarModel("123"));
        carModelList.add(new CarModel("456"));
        CarModel xss = new CarModel("789");
        carModelList.add(xss);

        for(CarModel model : carModelList){
            System.out.println(model);
        }

        Iterator<CarModel> iterator = carModelList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        carModelList.forEach(System.out::println);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(carModelList.size());
        System.out.println(carModelList.indexOf(xss));
        System.out.println(carModelList.contains(xss));
        System.out.println(carModelList.remove(xss));
        System.out.println(carModelList.contains(xss));


    }
}
