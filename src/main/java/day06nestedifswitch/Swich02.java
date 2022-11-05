package day06nestedifswitch;

import java.util.Scanner;

public class Swich02 {

    public static void main(String[] args) {

      /*
      Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz
         */

        //note:tolowerCase()metodu stringdeki tum characterleri  kucuk harfe cevirir
        //  toupperCase() methodu bir stringdeki tum characterleri buyuk harfe cevirir


        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismi giriniz...");
        String ayIsmi = input.next().toLowerCase();
        switch(ayIsmi){
            case "ocak":
                        System.out.println("Ocak");
            case "subat":
                    System.out.println("subat");
            case "Mart":
                    System.out.println("Mart");
            case"Nisan":
                    System.out.println("Nisan");
            case"mayis":
                    System.out.println("Mayis");
            case"Haziran":
                    System.out.println("Haziran");
            case"Temmuz":
                    System.out.println("Temmuz");
            case"Agustos":
                    System.out.println("agustos");
            case"eylul":
                    System.out.println("Eylul");
            case"Ekim":
                    System.out.println("Ekim");
            case"Kasim":
                    System.out.println("Kasim");
            case"Aralik" :
                    System.out.println("Aralik");
              break;
            default:
            System.out.println("Gecerli ay ismi giriniz...");

        }





    }





    }

