package day03typecastingwrapperscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DenemeNextLine {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("sevdigin yemek,sevdigin hayvan sevdigin kisi giriniz");
        String sevilenSeyler= input.nextLine();
        System.out.println(sevilenSeyler);
        List<Integer> nums = new ArrayList<>();
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);
        Integer sayi = 18;
        nums.remove(sayi);
        System.out.println(nums);






    }







    }

