package day18arrayListspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists01 {


    public static void main(String[] args) {

        // exp: 1:Bir int arraylistteki 7 haric tum elemanlari iki arttiriniz

        List<Integer> ages = new ArrayList<>(); //list ismi cogul verilir .elemanlar coklu old icin
        ages.add(12);//list ve array de en iyi loop for each looptur.
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);
        for (Integer w : ages) {

            if (w == 7) {
                continue;
            }
            //2 atrmadilar ,cunku listler boyle update yapilamazlar.set degistir metodunu kullan
            ages.set(ages.indexOf(w), w + 2);
        }
        System.out.println(ages);// badinin ustune yazinca tekrar ediyor her sayiyi asagiya yazdiriyor


        //} bunun altina yazinca sout bir kere tekrarliyor
        // exp:2:Size verilen array listte 8 ve 8 den onceki tum elemanlari 2 katina cikarin
        List<Integer> nums = new ArrayList<>();
        nums.add(12);//list ve array de en iyi loop f
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);
        for( Integer w : nums){

            nums.set(nums.indexOf(w), w*2);//eger sayiyi dahi edeceksek yani 8 bunu ifin ustune etmeyeceksek ifin altin
            if( w==8){                      // eger 8 i de update yapacaksak ustte kmoyari
                break;                      //inclusive dahil exclusive haric



        }




    }

        System.out.println(nums);

    }

}
