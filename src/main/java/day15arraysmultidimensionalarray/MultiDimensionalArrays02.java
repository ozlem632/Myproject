package day15arraysmultidimensionalarray;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {
        //MultiDimensionalarray kisa yoldan nasil olusturulur
        char arr[][] = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};
        System.out.println(Arrays.deepToString(arr));// sonuna kadar yazdirmak icin deepstring kullan
//bir stringdeki multidimensional arrayde icinde a olan elemanlari concole yazdiri
        String brr[][] = {{"learn", "Java", "it"}, {"is", "easy"}};
        for (String[] w : brr) {

            //[ "is", "easy" ]
            // [ "learn", "java", "it"


            for (String k : w) {
                if (k.contains("a")) {
                    System.out.print(k + " ");

                }
            }
        }
    }
}