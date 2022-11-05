package day01variables;

public class C02_Variables {
    public static void main(String[] args) {
        // 1:Farkli 3 data turunde variable olusturunuz ve bunlari yaziniz
        String okulismi = "Techpro";
        System.out.println("okulismi =" +okulismi);

        String isim="Ahmet Can";
        String soyIsim="Ates";

        System.out.println("isim=" +isim);
        System.out.println("soyisim =" + soyIsim);




        //3- Iki farkli tamsayi data turunde 2 variable olusturuz. bunlarain toplamini yazdirin

        short deger1=10;
        short deger2=20;
        System.out.println("iki farkli data turunun toplami =" +(deger1+deger2));

        int toplam=deger1+deger2;

        System.out.println("toplam =" + toplam);

        // 4: bir tam sayui ve bir ondalikli variable olusturun bunlarin toplamini yazdirin.
        int deger3=40;
        double deger4=0.8;
        System.out.println("deger4+deger3 = " + (deger3+deger4));
        //6: bir tamsayi ile bir harfi toplayiniz

        int deger5=20;
        char harf='M';
         // 1.yol:
        int toplam1=deger5+harf;

        System.out.println("toplam1 =" + toplam1);


        // 2. yol:
        System.out.println("deger5 =" + (deger5+harf));


        String a = "Hello ozlem";
        System.out.println(a);
        int deger8 = 45;
        int deger9 = 50;
        int top= deger8+deger9;
        System.out.println(top);
        System.out.println("top=" + (deger8 +deger9));
        int sayi =10;
        char letra ='H';
        int to=sayi+letra;
        System.out.println("toplam" +to );

        System.out.println("top =" + ( sayi + letra));






























    }//main
}//class
