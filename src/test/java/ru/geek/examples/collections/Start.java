package ru.geek.examples.collections;

import java.util.Objects;

public class Start {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = object1;
        Object object3 = new Object();

        System.out.println(object1.equals(object2));
        System.out.println(object1.equals(object3));

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("str " + str1.equals(str3));  //true
        System.out.println("str " + str1 == str3);       //false

        CarModel carModel1 = new CarModel("vaz2107");
        CarModel carModel2 = new CarModel("vaz2107");
        CarModel carModel3 = null;
        CarEngineType carEngineType = new CarEngineType("v8");

        System.out.println(carModel1.equals(carModel2));
        System.out.println(carModel1.equals(carEngineType));
        System.out.println(carModel1.equals(carModel3));

        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(object3.hashCode());


    }
}
class CarEngineType{
    private String type;

    public CarEngineType(String type) {
        this.type = type;
    }
}

class CarModel{
    private String model;
    private int year;

    public CarModel(String model){
        this.model = model;
        year =0;
    }

    public CarModel(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof CarModel) || obj == null){
            return false;
        }
        if(((CarModel)obj).model.equals(this.model)){
            return true;
        } else {
            return false;
        }
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        CarModel carModel = (CarModel) o;
//        return Objects.equals(model, carModel.model);
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
