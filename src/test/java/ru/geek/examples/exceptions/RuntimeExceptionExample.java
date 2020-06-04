package ru.geek.examples.exceptions;

import org.openqa.selenium.ElementNotVisibleException;

public class RuntimeExceptionExample {
    public static void main(String[] args) {

        //ArirhmeticException
//        try{
//            arithmeticExceptionExample();
//        }catch (ArithmeticException ex){
//            ex.printStackTrace();
//            System.out.println("exception is found ");
//        }
        //IndexOutOfBoundException
//        int[] a = {1,2,3,4,5};
//        try {
//            System.out.println(getElementByIndex(a, 5));
//        }catch (ArrayIndexOutOfBoundsException ex){
//            ex.getMessage();
//            ex.getMessage();
//        }

        //ClassCastException
//        Object object = 1;
//        try {
//            System.out.println((String) object);
//
//        }catch (ClassCastException ex){
//            System.out.println(object.toString());
//        }
        //NullPointerException
//        Object o = null;
//        try {
//            System.out.println(o.hashCode());
//        }catch (NullPointerException ex){
//            o = new Object();
//            System.out.println(o.hashCode());
//        }
        //StringOutOfBounds
//        String name ="Мурзик";
//        try{
//            System.out.println(name.charAt(7));
//        }catch(StringIndexOutOfBoundsException ex){
//            ex.printStackTrace();
//            System.out.println(name.charAt(name.length()-1));
//        }

//        try{
//            throw new ElementNotVisibleException("123");
//        }catch (ElementNotVisibleException ex){
//            ex.printStackTrace();
//        }
        //negativeArraySizeException
//        int i= -5;
//        try{
//            int[] arr = new int[i];
//        }catch(NegativeArraySizeException ex){
//            ex.printStackTrace();
//
//            int[] arr = new int[Math.abs(i)];
//            System.out.println(arr.toString());
//        }

        //NumberFormatException
//        String s= "u6";
//        int i = Integer.parseInt(s);

        //
//        String s= new String();
//        Object object = new Object();
//        object = (String)s;
//        Access access = null;
//        AccessException(access);
//        System.out.println(access.i);

    }
    public static int arithmeticExceptionExample(){
        return 5/0;
    }
     public static int getElementByIndex(int[] arr, int index){
        return arr[index];
     }
     
     public static void AccessException(Object object){
        object = new Object();
     }
     public class Access{
        int i;
         private Access() {
             i=10;
         }
     }


}

