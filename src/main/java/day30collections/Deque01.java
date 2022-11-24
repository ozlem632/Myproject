package day30collections;

/*
Deque :double ended queuemanasindadir.yani iki uclu queue demektkir.double ended iki tarafli demek .first in first out
fifo demek lifo last in first out.ikisi beraber gerektiginde deque kullanilir.

 */

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        Deque<String> furnitureTruct =new LinkedList<>();//mobilya kamyonu demek furni...
        furnitureTruct.add("chair");//metodlarda hep iki uclu
        furnitureTruct.add("mirror");
        furnitureTruct.add("sofa");
        furnitureTruct.add("bed");
        furnitureTruct.add("bed");
        furnitureTruct.add("bed");
        furnitureTruct.add("Dining Table");
        System.out.println(furnitureTruct);
        furnitureTruct.push("refrigenerator");
        System.out.println(furnitureTruct);





    }
}
