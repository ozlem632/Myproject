package day32Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        //FOR-EACHloop kullanarak her elemanin sonuna ! ekleyin
        for(String w :myList){
           //w=w+"!";//yapmadi.cunku looplar kendi baslarina collectionlari update yapamazlar.bu eksigi gidermek kicin iteratorleri
            //icad etti.bu collectionlari update etmek icin kullanilir
            ListIterator<String> itr=myList.listIterator();//new yaz,madik cunku myList vardi
            while(itr.hasNext());//java en basa pointer koyar listin basina.hasnext metoduna sorar senden sonra eleman varmi die
            String el=itr.next();//hasnext metodu elemanlarin ustunden atlar atladigini verir yanina da unlem koyar
            itr.set(el+"i");
        }
        System.out.println(myList);

    }
}
