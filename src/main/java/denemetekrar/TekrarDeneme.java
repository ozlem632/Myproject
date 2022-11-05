package denemetekrar;

import javax.swing.*;
import java.util.Scanner;

public class TekrarDeneme {


    public static void main(String[] args) {

        String a = "ozlem javayi basaracak";
        boolean s = a.startsWith("bas", 13);
        System.out.println(s);

        int c = a.indexOf("a");
        System.out.println(c);
        int w = a.indexOf("s");
        System.out.println(w);

//        Scanner input =new Scanner(System.in);
//        System.out.println("lutfen isminizi giriniz");
//        String isim=input.next();
//        char ilkHarf=isim.charAt(2);
//        char sonHarf =isim.charAt(3);
//        System.out.println(""+ ilkHarf + sonHarf);
//      String ilk = isim.substring(0,1);
//      String son =isim.substring(isim.length()-1);
//        System.out.println(ilk+son);
//        String str="Allahim Omeri sana havale ediyorum";
//        String n =str.substring(15);
//        System.out.println(n);
        String e = "Ali Can";
        char ilkHa = e.charAt(0);
        String soy = e.split(" ")[1].substring(1, 3);
        System.out.println(ilkHa + soy);
        String l = "Allahim bizi koru";
        String y = l.replace("a", "A");
        System.out.println(y);
        String b = "Karar kara dusunme";
        String yeni = b.replace("kara", "++");
        System.out.println(yeni);
        String sif = "Abcar bn9";
        boolean bir = sif.replaceAll(" ", "").length() > 7;
        boolean iki = sif.replaceAll("[^ \\p{Punct}]", "").length() > 0;
        boolean uc = sif.replaceAll("[^0-9]", "").length() > 0;
        boolean bo = bir && iki && uc;
        if (bo) {
            System.out.println("sifreniz gecerlkidir");

        } else System.out.println("gecerli degildir");
        String v = "alfabex";
        boolean ilk = v.startsWith("al");
        boolean son = v.endsWith("x");
        String sonuc = ilk && son ? "harika sayi" : "normal";
        System.out.println(sonuc);

        /*
           asagidaki yildizi yazdiriniz
           +
           ++
           +++
           ++++
           +++++
         */

//        for (int i = 0; i < 6; i++) {//satir
//
//
//            for (int j = 0; j < i; j++) { //j sutun sayisi sutun sayisini satir sayisina sabitledik
//
//
//                System.out.print("+");
//            }
//
//            System.out.println();


        int t,i;

        for (  t= 1; t <= 5; t++) {
            System.out.println("A=="+t);

            for (i=1; i<=3 ; i++){

            }
            System.out.println("i=="+i);

        }
        System.out.println();
    }

}
         // Public class MyClass

