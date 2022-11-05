package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner kullanicidan data almaya yarar.Scanner kullanici ile etkilesim
        //kurmanizi saglar.Scanner bir Java Class'idir,bu Class'i kullanabilmek icin import yapmak gerekir
        //Scanner Class'i Java'nin util kutuphanesidir.

        //1.Adim: Scanner Class'indan object olusturun
        Scanner input = new Scanner(System.in);

        //2.Adim:Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici age  gir....");

        //3.Adim: Kullanicidan aldiginiz data'yi bkir variable'nin icine koyun
        byte age = input.nextByte();
        System.out.println("Hey kullanici senin yasin=" +  age);
     int degerChar = 'S';
        System.out.println("S");
        System.out.println("y");






    }
}
