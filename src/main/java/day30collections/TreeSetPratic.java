package day30collections;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetPratic {
    public static void main(String[] args) {
        /*
        TreeSet tekrarsiz elemanlari alfebetik veya kucukten buyuge siralar(Natural  order)
        o nedenle ............dir
         */
        //exp 1:6 tane String elemani alfabetik siraya diziniz

        Long start1= LocalTime.now().toNanoOfDay();
        TreeSet<String> emails =new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("t@gmail.com");
        emails.add("y@gmail.com");
        emails.add("w@gmail.com");
        emails.add("n@gmail.com");
        emails.add("k@gmail.com");
        emails.add("g@gmail.com");
        emails.add("p@gmail.com");
        System.out.println(emails);
       Long end1= LocalTime.now().toNanoOfDay();
       System.out.println(end1-start1);

          //hizlarini kiyaslamak icin
//
      //
        HashSet<String>myEmails=new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("t@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("w@gmail.com");
        myEmails.add("n@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("g@gmail.com");
        myEmails.add("p@gmail.com");
        TreeSet myEmailsSorted=new TreeSet(myEmails);//demokrasilerde care tukenmez.HashSetin hizi Treesetin duzeni
        System.out.println(myEmailsSorted);
//interview sorusu imis
        System.out.println(myEmails);//rastgele yaziyor o yuzden hizli.



        Long end2= LocalTime.now().toNanoOfDay();


        System.out.println(end2-end1);


    }
}
