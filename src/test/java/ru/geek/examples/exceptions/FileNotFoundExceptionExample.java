package ru.geek.examples.exceptions;

public class FileNotFoundException extends Throwable {
//    public static void main(String[] args) {
//        //FileNotFoundException
//        File file = new File("C:/path");
//        try{
//            System.out.println("try block");
//            FileReader fileReader = new FileReader(file);
//            System.out.println("Dangerous code!");
//        }catch (java.io.FileNotFoundException ex){
//            System.out.println("catch block " + ex.getStackTrace() + " " + ex.getMessage());
//        }catch (IOException ex){
//        }catch (Exception ex){//
//        }finally {
//            System.out.println("finally actions");
//        }
//    }
    public static void main(String[] args) {
        FileReaderExample reader = new FileReaderExample();
        try {
            reader.readFile("1234567");
        } catch ( java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
