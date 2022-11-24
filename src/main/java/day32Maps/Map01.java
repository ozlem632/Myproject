package day32Maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Map01 {
    public static void main(String[] args) {
        //size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz
        //I like to move it move it==>I=1, like=1,move=2,it=2
        String str = "I like to move it,move it.";
        //noktalama isaretlerini silmeli.java onlari da gorur
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);
        //kelimeleri almak icin split kullanalim
        String[] kelimeler = str.split(" ");//kelimeler arasinda bosluk oldugu icin ara verdik tirnak arasi
        System.out.println(Arrays.toString(kelimeler));
        HashMap<String, Integer> gorunum = new HashMap<>();//arraylerde for each loop iyidir kullanmak
        for (String w : kelimeler) {
            Integer gorunumSayisi = gorunum.get(w);
            if (gorunumSayisi == null) {//null degerini yeni olusturacagi map icin kullandi.cunku kelimelerin kac defa kullanildigini
                //gormek icin ,kontrol ediyor
                gorunum.put(w, 1);


            } else {
                gorunum.put(w, gorunumSayisi + 1);//get metodu eleman yoksa null veriyor 0 yapmiyor


            }
        }
        System.out.println(gorunum);
        //


    }
}
