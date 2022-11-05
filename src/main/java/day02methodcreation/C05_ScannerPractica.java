package day02methodcreation;


import java.util.Scanner;

public class C05_ScannerPractica {
    public static void main(String[] args) {

        // kullanicidan ad soyad memleket bilgilerini alin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim=scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz...");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen memleketinizi giriniz...");
        String memleket= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        byte yas=scan.nextByte();
        System.out.println("Lutfen boyunuzu giriniz...");
        short boy =scan.nextShort();












    }
}
