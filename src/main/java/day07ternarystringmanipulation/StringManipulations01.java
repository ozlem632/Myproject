package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*

        String Class metodlari
        1)eguals(): i)iki tane stringin ayni olup olmadifgini anlamamiza yarar.
                    ii)eguals() metodu 'boolean ' return eder
         2)egualsIgnoreCase() i) iki tane string in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza
         yarar
                               ii)egualsIgnoreCase() metodu boolean return eder.true false yani

         3)tolowerCase() :i) bir stringten tum hardfleri kucuk harfe cevirmek icin kullanilir
                          ii)tolowerCase() metodu string return eder
          4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                                 ii) toUpperCase() method'u "String" return eder
                5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                             ii) charAt() method'u "char" return eder.

                6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                            ii) length() method'u "int" return eder.

                7)contains(): i)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                              ii) contains() method'u "boolean" return eder.

                8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
                           ii)split() method'u "Array" return eder.



                    /* bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz
                       I)en az 8 character icermeli
                       ii)space character icermemeli
                       III)ilk harfi 'M' veya 'm' olmali
                       iv)) son character '?' olamali

         */


        String pwd ="Mani sa12?";// leng() -1 son indeks demek


        //en az 8 character icermeli
        boolean first = pwd.length()>7;
          //  ii)space icermemeli
        boolean second =!pwd.contains(" ");
        // iii)ilk harfi M yada m olmali
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
        // son isaret ? olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';
        System.out.println(first && second && third && fourth);


    }
}
