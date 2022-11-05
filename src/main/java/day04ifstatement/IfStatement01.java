package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {


        // if it rains i will cancel the picnic
        //if statement belli kodlari belli sartlara bagli olarak calaistirmaya yarar
        // Example 1: Sayi pozitif ise ekrana pozitif yazdirin

        int s = 12;
        if (s > 0) {
            System.out.println("positive");

        }

        //Example 2: verilen character buyuk harf ise ekrana "Buyuk Harf" yazdir

        char ch = 'V';
        if (ch >= 'A' && ch <= 'Z') {

            System.out.println("Buyuk Harf");

        }
     /*

       && islemi sadece boolean ile kullanilabilir
         true && true  = true
         true && false = false
         false && false = false
         false && true = false
         && islemi mukemmeliyetcidir, true sonucunu alabilmek icin hersey true olmalidir
         bir tane false varsa sonuc false demektir

      */
        // Example 3: verilen bir sayi uc basamakli ise ekrana "uc basamakli" yazdirin
        int n = -430;
        n = Math.abs(n);


        if (n > 99 && n < 1000) {// n>=100 && n<=999 veya n>99 && n<1000
            System.out.println("uc Basamakli");
        }

        // Example 4: verilen bir sayi cift sayi ise ekrana cift sayi yazdiriliint `= -18

        int p = -18;

        //"=" isareti atama operatorudur, matematiteki esittir anlamina gelmez
        // matematikteki esittir sembolu java da "==" seklindedir
        // 2+3 == 5
        if (p % 2 == 0) {
            ;
            System.out.println("Cift sayi");
        }

        // example 5: verilen sayi 300 den kucuk veya 1200 den buyuk ise "Harika sayi" yazdirin

        int r = 250;

        if (r < 300 || r > 1200) {
            System.out.println("Harika sayi");


        }



     /*
          ||   islem  i sadece bolean ile kullanilir
          true || true = true
          true || false = true
          false || true = true
          false || false = true
          Note:|| veya demek.|| isleminde false almak icin herseyin false olmasi gerekir
          || islemeinde sadece bir tane true true yapmaya yeter



      */


    }


    }