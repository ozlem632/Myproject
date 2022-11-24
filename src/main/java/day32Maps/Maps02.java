package day32Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        //size verilen bir kmelimede kullanilan harflewrin kacar kere kullanildigini gosteren kodu yaziniz
        //abbcaa==>a=3,b=2,c=1
        String kelime ="abbcaa";
        HashMap<String,Integer>gorunum =new HashMap<>();
       String[] harfler= kelime.split("");//split bize array verir.tirnak arasina hiclik yaptik koseli parantez array demek
        System.out.println(Arrays.toString(harfler));


        for(String w: harfler ){
            Integer gorunumSayisi =gorunum.get(w);


            if (gorunumSayisi==null){
                gorunum.put(w,1);


            }else{
                gorunum.put(w,gorunumSayisi+1);

            }
        }
        System.out.println(gorunum);


    }
}
