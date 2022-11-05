package day10StringManipulation;

public class StringManipulation01 {

    public static void main(String[] args) {
        String a = "Java kolaydir";
        //startsWith("kola,5) kodu ilk 5 karakterden sonraki stringe bakar "kola" ile baslayip baslamadigini kontrol eder
        //kola ile basliyorsa true return eder

       boolean b= a.startsWith("kola", 5);

        System.out.println(b);
        // replaceFirst ( "a" ,"*" kod String deki "a" yi "*" cevirir
        //replace ise tum a lari yildiza cevirir
        String c=a.replaceFirst("a" ,"*");
        System.out.println(c);
        // concat metodu iki stringi bribirine yapistirmayua yarar
        //"concatenation islemi iki turlu yapilabilir.i) + ile ii) concat() ile
        // java bir islem icin method uretmisse o metodu kullanmak "best practice"dir

        String d = a.concat("Anladin mi");
        System.out.println(d);
        String e = "   Tom Hanks   ";//ismin basinda ve sonunda space var.
        //trim() metodu bir stringin basindaki ve sonundaki space karakterini siler orteya dokunmaz
        String f = e.trim();
        System.out.println(f);
        String h = "Java";
        String i = "Java";
                int k = h.compareTo("i");
        System.out.println(k);
        // compareTo kodu iki tane stringi alfebetik olarak karsilastirir(lexicographic)
        //buyuk kucuk harfe duyarlidir.eger bunu istemezseniz h.compareToIgnoreCase(i) kullanabilirsiniz
        //h.compareTo(i) kodda "h" nin alfebetik sirasindan i nin alfebetik sirasi cikarilir

        String n = a.repeat(-5);
        System.out.println(n);

        //a.repeat() metodu icine yazilan sayi kadar tekrarlar
        //repeat (0) sifir return yapar.
        //Windows icin ctrl tus mac icin comment basildiginda kutuphane cikar
        System.out.println(n);















    }
}
