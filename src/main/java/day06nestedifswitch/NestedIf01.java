package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {


        /*

        password'un ilk harfi buyuk ise

        'A' olursa gecerli password aksi halde gecersiz password
        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli password aksi halde gecersiz password
        nested iciice gecmis demek zigon sehpalar gibi
        her karakterin bir indeksi vardir.0 dan baslar 1 2 3 diye z ye kadar gider
        note:java "nested" kodlari calistirirken cok zaman harcar.buna ·Time Complexity  denir

        bu yuzden mumkunse "nested" kod yazmamaya calisiriz.


        String pwd = "Axy12!";//12345 sifrenin altina yaz//kucuk harflerin askii degerleri buyuklerden coktur

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {//parantez icinde indeksi 0 olan harf anlaminda.A dan Z YE
// indekste ilk karakter o dan baslar
            // harfler ICIN YAPILDI buyuk A nin ASCII degeri 65 Z nin 91 dir
            if (pwd.charAt(0) == 'A') {
                System.out.println("Gecerli Password");
       } else {

                System.out.println("Gecersiz password");
            }

        } else if (pwd.charAt(0) > 'a' && pwd.charAt(0) <= 'z') {
            if (pwd.charAt(0) == 'z') {
                System.out.println("Gecerli password");
            } else { // aksi halde gecersiz password
                System.out.println("Gecersiz password");

            }
            System.out.println("ilk karakter harf olmalidir"); //bir seyi bitrcok defa kullanacaksaniz bir kere sepe
            //te koyun ve kullanin

             */
        String pwd = "axy12!";
        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
            }else{

                System.out.println("Ilk karakter harf olmalidir,,,");
            }

        }


    }