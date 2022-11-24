package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    Arraylist indeksle calisir.Dezavantaj bir eleman silinirse tum indeksler degisir
    Yeni eleman ekleyince de indeks degisir.(reindeks)Java bunun icin Likedlist cikardi.Birinci bolum data ikinci bolumler pointer
    linked birbirine bagli demek.LinkedList de elemanlara (Node)denirse iyi olur.
    enson elemanin pointeer kismi nulldir.Elemanlar birbirini okla gosterir.ilk eleman Headdir.Son eleman Tail.Eleman silince
    indeks degismiyor.Eleman silinice onceki bir sonrakiyle baglanir.Arraylist eleman bulmada basarili indeksten dolayi
    Linked ise indeksle calismadigi icin (search)basarili degil.Sozlukte search gerekecegi icin ArrayList kullanilir
    Ekleme cikarma icin Linkedlist .Mesela sehir isimleri cok ekleniop cikmaz  o yuzden Arraylist
    */

    public static void main(String[] args) {
        LinkedList<String> visitores = new LinkedList();
        visitores.add("tom");
        visitores.add("Hanks");
        visitores.add("Tom hanks");
        visitores.add("Brad");
        visitores.add("Pitt");
        visitores.add("Brad pitt");
        visitores.add(2, "Angelina Julie");
        visitores.add("Tom Hanks");
        visitores.add("Brad Pitt");
        System.out.println(visitores);
        //LikedListler ekleme ve cikarmada cok basarili olduklari icin kullanilir
        visitores.removeLast();
        visitores.removeFirst();
        System.out.println(visitores);


        visitores.addLast("Ajda Pekkan");
        System.out.println(visitores);
        visitores.addFirst("Cuneyt Arkin");

        visitores.removeFirstOccurrence("Tom Hanks");// ilk gorunumunu siler digerini degil
        System.out.println(visitores);
        visitores.removeFirstOccurrence("Brad Pitt");// bu listte cok degisiklik olacagi icin metodlar olmali

        System.out.println(visitores);


    }
}


