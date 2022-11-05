package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {


        // kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz
        // Ramazan==>Rn

       Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = input.next();

       char ilkHarf = isim.charAt(0);

        char sonHarf = isim.charAt(isim.length()-1);// yazdiginiz code sadece belli durumlar icin calisirsa
        // o  code 'a "hard code " olu code denir
         //yazdiginiz code her durumda calisiorsa o code 'a (Dynamic Coding )denir

        System.out.println("" + ilkHarf + sonHarf);// "" + kullandik ascii degerlerini degil harfi kullansin diye


        // 2.yol
        String ilk =isim.substring(0,1);// Ramazan dan azani almak icin harflerin numaralarini ilk harfi alir ama son harfi
        // almaz.

       String son = isim.substring(isim.length()-1);
        System.out.println(ilk+son);// stringle tanimladigimiz icin ascii degerini almaz

        // ex: 2: verilen stringdeki hayvan isimlerini ekrana yazdiriniz

         // "Ben kedi esim tavuk oglum inek sever"


        String str = "Ben kedi, esim tavuk, oglum  sever inek";

       String kedi = str.substring(4, 10);

        String tavuk = str.substring(15,20);

       String inek =str.substring(34,39);// sadece 34 te olabilir .cunku sonuna kadar yazar

        System.out.println(kedi +tavuk+inek);



        // substring() in iki kullanimi var


        //1) substring(baslangic indexi, bitis indexi)stringin ortasindan bir parca alir
         //2) substring(baslangic indexi)String'in verilen indexten sonuna kadar almaya yarar
        // exp 3) Ilk isim ve soyismi iceren isimlerden ilk ve soy isimlerin basharflerini ekrana yazdiriniz
        // Ali Can==>     Tahsin Yurdakul==>



        System.out.println("ilk ve son isminizi giriniz..");
        String tamIsim = input.nextLine();
        String a = tamIsim.substring(0,1);
        String b= tamIsim.split("")[1].substring(0,1);// parcalamak icin kullandik spliti spacele birlikte ayirir
        // 0,1 dedik 0 alacak yani c yi alacak 1 i yani a yi almayacak

        System.out.println(a + b);












    }

    }

