package day26exceptions;

public class Exception04 {

    public static void main(String[] args) {

        int age =250;

        try {
            printAge(age);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    //yasi ekrana yazdiran kodu yaziniz
    public static void printAge(int age) {//yas yazdircaksa void yoksa int,strin vs  yazilir

        if (age <0 || age>200) {
            throw new IllegalArgumentException("yas negatif olamaz veya 200 den buyuk olamaz");//boyle yaparsak aplicasion calaismaya decvam eder
            //fakat girilen data yanlisa durmasi lazim.kullanici - girderse java yazmayacak hata verecek.
          //aplicasionun trafic isaretleridir.throw hata vermesi icin  yazilir.

        }
            System.out.println(age);


        }
    }
