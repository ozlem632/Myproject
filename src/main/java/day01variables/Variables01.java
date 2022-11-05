package day01variables;

public class Variables01 {
    //Variable nasil olusturulur?
    //1)Access Modifier 2)Data Type   3)Variable ismi   4)=     5)Deger    6);
    // Java`da ";" Ingilizcede "." gibidir
    //Ingilizce´de "cumle" deriz, Java´da "statement" deriz

    //"=" sembolu "Assignment(Atama) Operator" olarak adlandirilir
    //Assignment(Atama) Operator" sagdaki degeri alip soldaki variable`nin icine koyar


    public int age = 13;
    public int height = 183;
            // Java´da Data  Type´lari
    /*
                    Primitive Data Types
    1)int:Integer`in kisaltmasi. Integer tam sayi demektir 132 bit kullanir
          Matematik´de tam sayilarin basi ve sonu yoktur.fakat Java´da vardir
          En kucuk int = -2,147,483,648
          En buyuk int =  2,147,483,647

   2)byte:Tamsayilar icin kullanilir.8 bit kullanir
         En kucuk byte = -128
         En buyuk byte = 127


  3)short: Tamsayilar icindir. 16 bit kullanir
           En kucuk short = -32768
           En buyuk short =  32768
  4)Long: Tamsayilar icindir. 64 bit kullanir.
          En kucuk long = -9,223,372,036,854,755,808
          En buyuk long =  9,223,372,036,854,755,807
  5)float: Ondalikli sayilar icindir. 32 bit kullanir
           "float virgulden sonra 7 basamak icerebilir
  6)double; Ondalikli sayilar icindir. 64 bit kullanir
            "double" virgulden sonra  16 basamak icerebilir
  7)boolean: true veya false degerleri icin kullanilir. 1 bit
  8) char:Tek karakter icin kullanilir.16 bit
          A,C,2,?,_,= etc
          Not: "char" lara deger verirken,degeri tek tirnak arasina koyunuz ,hata verir

          Note: Java buyuk ve kucuk harflere duyarlidir.
          Java icin TRUE ile true tamamen farklidir
   Note: Numeric Data Types: byte<short<int<long<float<double
         Numeric olmayan Data Types:boolean - char

                  Non-Primitive data Types
   String: Isim,adres,kimlik no gibi bir veya birden fazla karakter iceren degerl kull.
           String degerleri mutlaka cift tirnak arasina konulmalidir
           String non-primitive'dir.String olustugunda java size method verir.
     */

    public byte price = 12;
    public short poblationofVillage = 23000;



  // Siz "Long" demenize ragmen Java verilen sayiyi "int" kabul eder
  // Bu yuzden, long variable´a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" koyunuz




    public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.000012045;
    public long populationOfWorld = 7000000000L;

    // Burada "L" koymadigimiz halde problem yok cunku "1234"  int araligina uy.
    public long x =1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial ='5';

    public String name = "Tom Hanks";

    // main method arabanin motoru gibidir
    //Main method calismadan hic birsey calismaz

    public static void main(String[] args) {

    }

    }
















