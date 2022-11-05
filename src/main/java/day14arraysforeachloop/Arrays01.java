package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrays'lerin icine "primitive data type" leri ve "reference"(adres) lar konabilir.



            String str[] = new String[3];//bunu stringi arraya cevirmek icin yapiyoruz
            str[0] = "Java";
            str[1] = "did";
            str[2] = "surprise you";
            System.out.println(Arrays.toString(str));

            //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
            String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

            for(String w : arr){
                System.out.print(w + " ");
                if(w.equals("Tom")){
                    break;
                }
            }

            System.out.println();

            //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
            String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

            for(String w : brr){
                if(w.equals("Jane") || w.equals("Tom")){
                    continue;
                }
                System.out.print(w+" ");
            }

            //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
            //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

            Scanner input = new Scanner(System.in);
            System.out.println("");




                    }





        }










