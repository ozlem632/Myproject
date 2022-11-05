package day15arraysmultidimensionalarray;

import java.util.Arrays;

public class Array03 {

    public static void main(String[] args) {

        //Exp:1: bir stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //a-e-i-o-u-A-E-I-O-U

        String str = "Java ogrenince para kazanmak kolay ,ogrenmeyince ne kolay ki.";
          str = str.toLowerCase();

        String harfler[]= str.split("");//split metodu array verir .koseli parantez arraydir
        int counter = 0;//bir seyi olusturmazsan arttiramazsin

        System.out.println(Arrays.toString(harfler));// stringi arrayde yazdirmak icin tostrin kullanilir
        for(String w: harfler){// birden fazla durum icin ayni seyi yapacaksaniz bi sntaxi kullanin

            switch(w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;

            }
        }

        System.out.println(counter);



    }
}
