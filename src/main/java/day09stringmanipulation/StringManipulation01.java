package day09stringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {


        String str = "Java is easy";
        // indexOf() method'u verilen character ve characterlerin ilk gorunumunun index'ini verir

        int idxA = str.indexOf("a");
        System.out.println(idxA);
        //LASTINDEXOF()methodu

        int idxA2 = str.lastIndexOf("a");

        System.out.println(idxA2);// Kara buyuk harfle basladigi icin kabul etmedi ilki  kucuk olmali


        String a = "kara kara dusunme Ankara";
        int src1 = a.indexOf("kara");
        System.out.println(src1);
        int src2 = a.lastIndexOf("kara");
        System.out.println(src2);


        String s = "Missisippi";

        int idxI = s.indexOf('i');

        System.out.println("i");

        int idxIss1 = s.indexOf("iss");//ilk gorunumun ilk karakterinin indeksini verir
        System.out.println(idxIss1);
        int idxIss2 = s.lastIndexOf("iss");//son gorunumun yine ilk karakterini verir
        System.out.println(idxIss2);
        //ex: 1: Bir Strindeki characterlerin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        //                "Helloooo ==>  H--> tekrarsiz    e-->Tekrarsiz  l-->tekrarli    o-->Tekrarli
        String t = "Helloooo";
        char c = 'H';
        if (t.indexOf('H') == t.lastIndexOf('l')) {// parantez icine c de koyabiliriz karakter yerine
            System.out.println("Tekrarsiz");

        } else {

            System.out.println("Tekrarli");

        }
        String u = "Learn Java earn money";
        int sonuc = u.indexOf("", 5);// eger harf ve sayi belirtirsek o sayinin indeksine kadar saymiyor

        System.out.println(sonuc);//iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar charcter'i
        //gectikten sonra istenen characterin ilk gorunumunun indexini verir


        int son = u.lastIndexOf("a", 4);// en sondan bes taneyi sildi a yi geri kalanin icinde aradi
        System.out.println(son);//
      // iki parametre ile kullanilirsa 2. parametrede verilen sayiyi indeks olarak kabul edip en bastan indekse kadar olan karak
       // karakterleri bir kutu icin e aliniz ve lastIndeksOf () sadece bu kutu icin kullaniniz


        String m = "Hello everyone";
        int e =m.lastIndexOf("e",10);// o dan indeks 10 kadar geliyor.aradan harfin son gorunumunu aliyor

        System.out.println(e);

        String v = " ";
        boolean bosMu = v.isEmpty();//True false dondurdugu icin boolean kullandik
        System.out.println(bosMu);// isEmpty() methodu bir stringin bpos olup olmadigini kontrol eder
        //eger String de hic karakter yoksa isEmpty() "true " ,herhangi bir character yoksa "false" dondurur
        String x =" ";
        //isBlank() hem bos string icin hem de sadece space iceren stringler icin true return eder
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true space olsada
        //example: 2: kullanicidan alinan isim mutlaka spaceden farkli en az bir  karakter icermelidir
        Scanner input =new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();
        if(ilk.isBlank()){
            System.out.println("sana ismini gir dedim...");
            System.out.println(ilk);





























        }

















    }

}