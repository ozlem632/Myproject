package day16multidimensionalarraysLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysLists01 {
 // Array listler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir
    // Array ile ArrayListin farki nedir,
    //Array olustururken eleman sayisini soylemeniz lazim,AFazla eleman koyamayiz array eleman sayisinda fixed dir
    //arraylistlerde eleman sayisini soylemeye gerek yok ,cunku arraylistler eleman sayisinda flexible(esnek
    //Arraylerin icine "primitive ve reference konur
    //arraylerlistlerin icine sadece non-primitiveler
    //Arrayler super fast cok hizli Arrayler memory az kullanir
    //not eleman sayisi kesin belli olan durumlarda array kullanin-eleman sayisi coklu datalarda
    // array kullanma riskini almayin
    public static <integer> void main(String[] args) {

       // ArrayListler nasil olusur
        ArrayList<integer> ages = new ArrayList<integer>();
        //2.yol
        ArrayList<Integer> heights = new ArrayList<>();//integer koymaya gerek yok
        // 3.yo
        List<Integer> nums = new ArrayList<>();

        // arraysler nasil yazdirilir
        System.out.println(nums);
        // Arralistlere nasil eleman eklenir
       // Add() her zaman elemani en sona ekler (insertion order).orden de insercion
        nums.add(21);
        nums.add(18);
        nums.add(20);

        System.out.println(nums);

        nums.add(1,50);
        System.out.println(nums);// // [21, 50, 18, 20, 23, 185]/ istediginiz indekse istediginiz elemani yazar

     List<Integer> prices = new ArrayList<>();
     prices.add(23);
     prices.add(185);
     nums.addAll(2, prices);
        System.out.println(nums);// [21, 50, 23, 185, 18, 20, 23, 185]


        //arraylistlerin eleman sayisi nasil bulunur
        // get metodu istenen indexteki elemani verir

        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);//8

        //ArrayList'lerde herhangi bir eleman nasil secilir?
        //get() methodu istenen bir index'teki elemani verir
        int el1 = nums.get(3);//185
        System.out.println(el1);
        //arraylistin bos olup olmadigini nasil anlariz
        boolean bos1= nums.isEmpty();
        System.out.println(bos1);// false
        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);//true)

        // arrayslerde eleman nasil degisir
        nums.set(3,200);//[21,50,23,200,18,20,23,185]
        //set metodu kullandik
        //ex:1: nums arraylistteki sayilari 11 arttirdiktan sonra ekrana yazdiriniz
        for (int w :nums){
            if(w%2!=0){
                nums.set(nums.indexOf(w) , w+11);
                System.out.println(nums);
             //remove metodu nun icine tamsayi koyarsaniz java onu index olarak kullanir
                // ustu cizili bir sey varsa  yakinda degisecek demek

                Integer sayi = 200;// buyuk I le yazilan integer wrapeer class degistirilir.// cunku non primitive cevrilir
                nums.remove(sayi);
                System.out.println(nums);// [32, 50, 34, 200, 18, 20, 34, 196]

                //remove() method'unu icine tamsayi koyarsaniz Java onu index olarak kabul eder

                //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu siliniz
                //Note 1: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir, yani "int" dir.
                //Note 2: "primitive" ler ArrayList'lerin elemani olamazlar.
                //Note 3: "primitive" i "Wrapper Class" a cevirirseniz, non-primitive olur ve non-primitive ler ArrayList'lerin elemani olur, index olamaz
                Integer say= 34;// bunu integeri cizili gorunce bunu yazdi wrapper class
                nums.remove( new Integer(200));// ciziliyse java kaldiracagim diyor
                nums.remove(sayi);// bunu da Integer sayiyi ekleyince yapti

                System.out.println(nums);// [32, 50, 200, 18, 20, 34, 196]


            }


        }

















    }
}
