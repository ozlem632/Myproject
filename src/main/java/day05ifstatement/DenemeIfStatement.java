package day05ifstatement;

import java.util.Scanner;

public class DenemeIfStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        byte sayi = input.nextByte();
        if (sayi == 1) {
            System.out.println("bu ise devam et");

        } else if (sayi == 2) {
            System.out.println("biraz daha dusun");

        } else if (sayi == 3) {
            System.out.println("Allah sana yardim edecek...");

        } else System.out.println("bu sana iyi gelecek");

        System.out.println(" bir Allah ismi giriniz");
        String isim = input.next();
        if (isim.equalsIgnoreCase("Rahman")) {
            System.out.println("terbiye edici ");


        } else if (isim.equalsIgnoreCase("Rahim")) {
            System.out.println("Affedici");



        }else System.out.println("Onun butun isimleri guzeldir");
    }
}