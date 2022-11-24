package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*
    TreeSet tekrarsiz elemanlari alfabetik veya kucukten buyuge (natural order)dizer

     */

    public static void main(String[] args) {
        //example:1:sekiz tane unique string elemanini alfabetik siraya depolayiziz
        long start1= LocalTime.now().toNanoOfDay();
        TreeSet<String> emails =new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("@gmail.com");
        emails.add("j@gmail.com");
        System.out.println(emails);
        long end1=LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);
        HashSet<String> myEmails =new HashSet<>();
        emails.add("a@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("@gmail.com");
        emails.add("j@gmail.com");

        TreeSet myEmailsSorted =new TreeSet(myEmails);//hashseti treesete cevirerek treesetin yavaslogindan kjurtuluruz.elemanlari has
        //Setle ekleriz treeSetle de alfabetik skiraya gore dizeriz
        System.out.println(myEmails);
        long end2=LocalTime.now().toNanoOfDay();
        System.out.println(myEmailsSorted);







    }



}



