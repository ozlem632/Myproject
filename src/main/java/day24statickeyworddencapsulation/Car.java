package day24statickeyworddencapsulation;

public class Car {


    public static String make = "Honda";
    public String model = "Accord";
    public int price = 2000;//degisiklik yapildiginda tum objeler etkileniyorsa statictir
    public static  int counter =0;


    public Car (){


        counter++;
        price++;
    }
}
