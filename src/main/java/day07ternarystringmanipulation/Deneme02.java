package day07ternarystringmanipulation;

import java.util.Scanner;

public class Deneme02 {

    public static void main(String[] args) {

    /*Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
    ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
    yazdırınız.
    Örnek: France

 */

//        String ulkeIsmi = "frAnce";
//
//        String ilkHarf = ulkeIsmi.substring(0,1).toUpperCase();
//        System.out.println(ilkHarf);
//        String geriKalan= ulkeIsmi.substring(1).toLowerCase();
//        System.out.println(geriKalan);
//        System.out.println(ilkHarf+geriKalan);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Ulke ismini giriniz");
//        String ulkeIsmi = input.nextLine();
//        String ilkHarf = ulkeIsmi.substring(0,1).toUpperCase();
//        String geriKalan= ulkeIsmi.substring(1).toLowerCase();
//        System.out.println(ilkHarf+geriKalan);



        /*  ikinci soru
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
        */

            String name1 = "Ali Can";
            String name2 = "Merve Star";
            String name3 = "Mark Tom";
            int newname1 = name1.replaceAll(" " ,"").length();
            int newname2 = name2.replaceAll(" " ,"").length();
            int newname3 = name3.replaceAll(" " ,"").length();

            System.
                    out
                    .println("Bosluk karakteri olmadan 3 ismin toplam Karakter sayisi:" + (newname1 + newname2 + newname3));

        /*
        Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.

        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
        */

            String str = "Miami 33018!!!";
            int karakterSayisi = str.
                    replaceAll(" ", "").
                    replaceAll("[^A-Za-z0-9]","").
                    length();
            System.
                    out.println("Toplam Alfabetik Deger: " + karakterSayisi);


        }
    }


