package day01variables;

public class C03_DataTypes {



        /*

    Java'da temelde 2 farkli data type vardir
    1) PRIMITIVE(ILKEL):Data Types: 8 tanedir
   1 bit a)Boolean ==> true ve false sadece iki deger alabilir.Boleanlar sadece iki deger aldigi icin memoryde az yer kaplar

   16 bit b)char ==> tek karakterli ifadeler icin kullanilir.1 char= 16 bityer kaplar
   // charlarla matematiksel islem yaparsaniz karakterlerin ASCII degerini kullanir
   8 bit  c)byte ==>-128 den 127 araligindaki sayilari kapsar
   16 bit d)short ==>-32768 den 32767'e kadar olan tum sayilari icerir.
   32 bit e)int==>-2147483648'den 2147483647'e kadar olan tum sayilari icerir,(10 basamaklki)
   64 bit  f)long==> -9223372036854755808 ile 9223372036854755807'e kadar tum tam sayi degerlerini alir.
   32 bit  g)float==> ondalilik sayilar icin kullanilir.ondalik kisimlarinda en fazla 7 rakam barindirir.
   64 bit  h)double==>ondalikli sayilar icin kullanilir. 16 rakam barindirir
         Programcilar floata gore daha fazla yer kaplasa da double'yi kullanirlar ; floatta sona f eklendigi icin
       2)NON-PRIMITIVE DATA TYPE ==>Daha fazla daha kaliteli
       String ==>cift tirnak arasina yazilan sifir yada daha fazla character'lerden olusur
       istersen cift tirnak arasina destan da yazabilirsin



         //bit==>Memorynin en kucuk yapi tasina bit denir
      //byte==>8 bit 1 byte esittir
      boolean emeklimi=false;
      boolean sarisinmi=true;


      /*
        PRIMITIVE DATA TYPELARI ILE NON-PRIMITIVE  DATA TYPE'LARI ARASINDAKI FARKLAR NELERDIR?
        1)primitive'de tum harfler kucuk; non-primitive'de ilk harf buyuk
        2)primitive data typelarini Java olusturmustur, biz primitive data typelarini olusturamayiz.
        ama non-primitive data type larini Java programcilari tarafindan istenildigi kadar olusturulabilir.
        3)primitive data typelarin memoryde kapladigi yer degisirken; non-primitivelerin memoryde kapladigi yer hep aynidir
        4)primitive data typelarinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir.
        non-primitive'lerde ise degeri ve methodlari vardir.
        5)primitive 'ler renklenirken mavi renklenirken ; non-primitiveler renklenmez.Or: String siyah kalir
     */

    public static void main(String[] args) {

        int uzunluk=20;
        System.out.println("uzunluk = " + uzunluk);



        double db=0.8;
        System.out.println("db = " + db);

        String str="Sumeyye";
        System.out.println("str = " + str);
        // int 3 variable olusturun ve toplamini yazdirin
        int a=2, b=3, c=4;
        System.out.println("a+b+c = "+(a+b+c));
















    }













}


