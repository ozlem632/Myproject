package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    /*
    LikedHashSetler elemanlari ekleme sirasina (insertion order araya kpoyma denir)gore hyerlestirir

     */
    public static void main(String[] args) {
        LinkedHashSet<String> emails=new LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");
        //linkedHashSet elemanlari verilen siraya gore yerlestirerek zaman harcar ama hashSetler oyle degil

    }
}
