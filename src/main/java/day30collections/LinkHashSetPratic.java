package day30collections;

import java.util.LinkedHashSet;

public class LinkHashSetPratic {
    public static void main(String[] args) {
        /*
        Linked setler elemanlari verilen siraya gore dizer (Insertion order)
        LinkedHashSet daha yavastir HashSete gore
         */

        LinkedHashSet<String> emails = new LinkedHashSet<>();
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);
        System.out.println(emails.size());//kactane oldugunu


    }


    }