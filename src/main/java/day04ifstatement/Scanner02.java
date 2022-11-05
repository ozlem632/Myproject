package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*

       Note:Char variable'leri matematiksel islemlerde kullanirsaniz, java onlarin ASCII degerlerini
       kullanir.Ornegin; System.out.println('A' + 'C' ); ekrana AC yerine 132 yazdirir
       Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)birlestirme islemi(Concatenation)
             Java "+" sembolu gorunce toplama islemi yapmaya calisir,yapamazsa birlestirir,oda olmazsa hata verir

               */
    public static void main(String[] args) {
        // Example 1: Kullanicidan ilk ve soy ismini giriniz. ilk ve soy isminin ilk harflerini yazdiriniz
        //        Ali Can ==>  AC

        Scanner input = new Scanner(System.in);

        System.out.println("ilk ismini giriniz...");
        char ilk = input.next().charAt(0);//A
        System.out.println("Soy ismini giriniz...");
        char son = input.next().charAt(0);//C
        System.out.println(" " + ilk + son);


       // 2.yol

        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine();// Ali Can

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);



    }


}