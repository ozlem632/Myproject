package day32Maps;

public class StaticBlock01 {
    //bir tane variable olusturalim
    public static double pi = 3.14;//main metoddan once variable elimizde olsun isteriz

    static {
        System.out.println("static block 2");

    }

    //pi variablesini static yaptik
    //static bloklar ihtiyacimiz olan variablelerin class olusturma safhasinda elimizde olmasini saglar.
    //static bloclar  class icindeki herseyden once calistirilir .main metoddan ve diger tum methodlardan once calistirilier
    //static blocklar icinde sadece static variablelere deger atanabilir
    //1 den fazla static blok varsa ustteki once calistirilir


    public static void main(String[] args) {
        System.out.println("main method");
    }
        static {//static blocklarda sadece static olan variablelere deger aftanabilir
            pi = 3.14;//static
            System.out.println("Static block 1");
        }
    }
