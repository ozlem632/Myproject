package day08stringmanipulations;

import jdk.swing.interop.SwingInterOpUtils;

public class StringManipulation02 {

    public static void main(String[] args) {


        // ex: 1: Bir stringdeki space haric kac tane charactyer kullanildigini gostern kodu yaziniz
        //                 "Ali okula gitti." ==>

        String str = "Ali okula gitti ";



        int num  = str. replace(" ", "").length();

        System.out.println(num);

        //  replace de ne cikaracagini ne koyacagini soyluyor
        //replace metodu bir strindeki herhangi bir characteri veya characterletri degistirmek icin kullanilir

        // ex:2: bIR STRINGDEKI Tum 'a' harflerini 'A' buyuk charectere ceviren kod

        String s = "Ankara'nin tasina gozlerinin yasina bak";

        String yeniS = s.replace("a" , "A");
        System.out.println(yeniS);

        //EX:3:Bir stringdeki tum kara kelimelerinin yerine "*" koyunuz
        String t = "kara kara dusunme Ankara";
        String yeniT = t.replace("kara",  "*");
        System.out.println(yeniT);


        // Ex:4:Bir stringdeki tum sayilari yildiza ceviriniz

        //                       "AC202117004" ==> AC*******

        String stdId = "AC202117004";
        String yeniStd = stdId.replaceAll("[0-9]" , "*");
        System.out.println(yeniStd);



        /* Bir grup datayi ifade eden kodlara "Regex" denir
        "Regex regular expressions un kisaltilmis halidir.
        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum harfler== [a-z,A-Z]
        5)  Sesli harfler ==>[aeiouAEIOU)
        6) space ==>[ ]
        7) Tum rakamlar ve tum harfler ==>[0-9a-zA-Z]
        8) Tum noktalama isarte==>[ ª\\p{Punct}
        1)Rakamlar haric tum karakterler ==>[^a-z]








         */
        // ex: 5 :Verilen bir stringte kullanilan noktalama isaretio ve rakamlar  ve space karakteri haric
        // tum karakterlerin sayisini bulan kodu yaziniz
        String u = "Ali 13 yasinda, dersem inanma!....";

        int sonuc = u.replaceAll("[0-9]", "").
                replace(" ", "").
                replace(" " ,"").
                replaceAll("\\p{Punct}" , "").
                length();
        System.out.println(sonuc);

        // ex:6:Bir passwordun gecerli olup olmadigini asgidaki kurallara gofre test eden kodu hyaziniz
        // i )Space haric en az sekiz karakter olmali
        //ii)en az bir sembol icermeli
        //iii)En az bir rakam icermeli
        //iv)En az bir buyuk harf icermeli
        // v) En az 1 kucuk harf icermeli

        String pwd = "878c? K!m ";
        //i) Space haric en az sekiz karakter icermelidir
        boolean first = pwd.replace(" ", "").length()>7;

        // ii) En az bir sembol icermelidir
        boolean second = pwd.replaceAll("[^0-9a-zA-Z]", "").length()>0;

       //iii) En az bir rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", ""  ).length()>0;

        // iv) en az bir buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        //v) En az bir kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;
        //replace methodu bosluklari kaldirmak icin kullanilir

        boolean pwdGecerli = first && second && third && fourth && fifth ;
        if(pwdGecerli){
            System.out.println("Password'unuz gecerlidir....");
        }else {
            System.out.println("Password'unuz Gecerli degil....");
        }
        // ex: 7: Bir string'deki noktalama isaretlerinin  sayisini gosteren kodu giriniz
        String cumle = "Sen yapmazsan, ben yapmazsam,?....";//noktalama isaretlerini digerlerini atarak sayabiliriz

        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();

        // ex: 8: Verilen bir string "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika"yazdirin
        // aksi halde "Normal"yazdirin.

        String v = "Alex";
        boolean baslangic = v.startsWith("Al"); //startWith onunla basla demek
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "Harika" : "Normal";

        System.out.println(result);





















    }
}
