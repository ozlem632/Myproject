package day18arrayListspassbyvalue;

public class MethodOverLooding01 {
    public static void main(String[] args) {
        /*
       Method Overloading nasıl yapılır?
       1)Method isimleri aynı olmalıdır
       2)Method parametreleri farklı olmalıdır
            i)Parametre sayılarını değiştirilebilir
            ii)Parametrelerin data tiplerini değiştirebilirsiniz
            iii)Parametrelerin yerlerini değiştirebilirsiniz ancak
                data tipleri farklı ise aynı ise değiştirmenin bir anlamı yoktur zaten
       3)Method İsmi + Parametreler = Method Signature (Methodun İmzasıdır)
         Method Signature dışında ne değiştirirseniz değiştirin
         Java o methodları farklı kabul etmez.
     */

            add(3,5);
            add(3, 5.0);
        }
        public static void add(int a, int b){
            System.out.println(a+b);
        }
        public static void add(int a, int b, int c){
            System.out.println(a+b+c);
        }
        public static void add(int a, double b){
            System.out.println(a+b);
        }
        public static void add(double a, int b){
            System.out.println(a+b);
        }
    }


