package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        /*
        iki tane Stringin birbirine esit olup olmadigini anlamak icin "=="esti degil"eguals()kullanilir
        iki tane String'in birbirine esit olup olmadigini kontroil etmek icin iki tane method kullanilabilir-
           i)eguals() ==> Buyuk harf ve kucuk harfi onemser."A" ile "a" farklidir
           ii)egualsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez."A" ile "a" aynidir


         */


        //ex.1: kullanicidan gun isimlerini aliniz.O gunun hafta sonu mu hafta ici mi oldugunu kullanicya soyleyiniz

        //pazartesi===>hafta ici   pazar==>hs

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz...");
        String gun = input.next();

        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi...")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("sali...")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Çarşamba")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Perşembe")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else {
            System.out.println("Geçerli bir gün ismi giriniz....");

        }
         /*

        //2.Yol:
        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
         */

            // 3.yol
          boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");
            // kullanicinin girdigi gun pazar mi cumartesi mi diye sorulur

          boolean haftaIci = gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma");
          if(haftaSonu){
              System.out.println("Hafta sonu...");

          } else if(haftaIci){
              System.out.println("Hafta ici...");

            } else {

                System.out.println("Gecerli bir gun ismi giriniz...");

            }


        }


    }