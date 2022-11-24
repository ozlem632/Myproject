package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<String>wareHouse=new LinkedList();//warehouse depo demek.Queue ilk giren ilk cikar
        wareHouse.add("milk");
        wareHouse.add("meat");
        wareHouse.add("Bread");
        wareHouse.add("honey");
        wareHouse.add("tomate");
        System.out.println(wareHouse);
        wareHouse.offer("potatoes");//kapasiteyi asarsa eklemkiyor
        System.out.println(wareHouse);



    }
}
