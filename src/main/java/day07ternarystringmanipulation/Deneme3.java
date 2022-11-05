package day07ternarystringmanipulation;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Deneme3 {

    public static void main(String[] args) {
    /*
        String c = "Helloooo";
       char l = 'e';
        if (c.indexOf('l') == c.lastIndexOf('l')) {
            System.out.println("Tekrarsiz");


        } else {
            System.out.println("Tekrarli");
        }


        String t = "Yillarrr";
        char z = 'Y';

        if (t.indexOf(z) == t.lastIndexOf(z)) {
            System.out.println("Tekrarsiz");
        } else {
            System.out.println("Tekrarli");


            String m = "M .Fetullah Gulen";

            int sonuc = m.indexOf("n", 4);
            System.out.println(sonuc);
      */
        String k = "Nudret'in kusu var";
        int son = k.indexOf('u', 3);
        System.out.println(son);


        String v = "";
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);


        String x = " ";

        boolean blackMi = x.isBlank();
        System.out.println(blackMi);

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun giriniz");

        String cumle = input.nextLine();
        if (cumle.equalsIgnoreCase("pazar") || cumle.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Harika gun");
        } else if (cumle.equalsIgnoreCase("pazartesi") || cumle.equalsIgnoreCase("sali")) {
            System.out.println("is gunu");

        } else {
            System.out.println("cennet gunu");
        }

            int b = 34;
            if (b > 0) {

                System.out.println("pozitif");

            } else{
                System.out.println("pozitif degil");
                // 2.YOL
                String sonuc= b>0  ?   "pozitif"    :   "pozitif degil";
                System.out.println(sonuc);
            }

        }

    }