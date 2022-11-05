package day25_exeption;

public class E03 {
    public static void main(String[] args) {
        String str = "Ali";//lenght 3 tur indeks 2 dir,karistirma
        getNumOfChars(str);
        String s = "";
        getNumOfChars(s);//0 aliriz
        String a;//desek null aliriz.

        String t = null;
        getNumOfChars(t);//NullPointerException

    }

    //Bir String te bulunan karakterlerin sayisinki bulabilmek icin bir method.
    public static void getNumOfChars(String str) {
        try {

            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("lenght metodfunda ñproblem olustu");
            e.printStackTrace();
            //bu metodu kullandigimiz zaman sout kullanmaya gerek yok .cunku run icinde getin


        }
    }


}