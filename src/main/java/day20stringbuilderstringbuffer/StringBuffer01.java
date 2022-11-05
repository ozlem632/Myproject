package day20stringbuilderstringbuffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBuffer01 {


    public static void main(String[] args) {


    /*
        1)StringBuffer Java'da bir class'dir ve String olusturmaya yarar.
        2)StringBuffer Class, StringBuilder Class gibi "mutable" dir.

        StringBuffer ile StringBuilder in farki nedir?
        1)StringBuffer "thread-safe" dir.
        2)StringBuffer "synchronized" dir.

        Senaryolar
        1)Degistirilemez data icin "String Class" kullanilir
        2)Degistirilebilir ama "multi-thread" gerekmeyen durumlar icin "StringBuilder" kullanilir
        3)Degistirilebilir ve "multi-thread" gereken durumlar icin "StringBuffer" kullanilir
     */


        List<Integer> list = Arrays.asList(10, 31, 15, 7, 15, 7, 7);
        List<Integer> list2 = new ArrayList<>();

        for(int i=0; i<list.size(); i++) {
            for(int k=0; k<list.size(); k++) {
                if(!list2.contains(list.get(k)))
                    list2.add(list.get(k));
                continue;
            }
        }
        System.out.println(list2);
        System.out.println("listede "+list2.size()+" farklı sayı var");// bunu ben koydum.




    }



}


