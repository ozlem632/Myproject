package day20stringbuilderstringbuffer;


import com.sun.jdi.PathSearchingVirtualMachine;

import java.time.LocalDate;
import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Bir kenar uzunlugu giriniz");
        int kenar = input.nextInt();
        System.out.println("bir karakter giriniz" );
                char ch = input.next().charAt(0);



        for(int i=1;i<=kenar;i++) {
            for (int k = i; k <= kenar; k++) {
                System.out.print(" ");
            }


            for (int m = 1; m <= i; m++) {
                System.out.print(ch + " ");
            }
            System.out.println();



        }
        LocalDate myDate =LocalDate.of(1989,4,22);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if((day>20 && month==3) || (day<21 && month==4)){
                System.out.println("Koç Burcu");
            }
            if((day>20 && month==4) || (day<21 && month==5)){
                System.out.println("Boğa Burcu");
            }
            if((day>20 && month==5) || (day<22 && month==6)){
                System.out.println("İkizler Burcu");
            }
            if((day>21 && month==6) || (day<23 && month==7)){
                System.out.println("Yengeç Burcu");
            }
            if((day>22 && month==7) || (day<24 && month==8)){
                System.out.println("Aslan Burcu");
            }
            if((day>23 && month==8) || (day<24 && month==9)){
                System.out.println("Başak Burcu");
            }
            if((day>23 && month==9) || (day<24 && month==10)){
                System.out.println("Terazi Burcu");
            }
            if((day>23 && month==10) || (day<23 && month==11)){
                System.out.println("Akrep Burcu");
            }
            if((day>22 && month==11) || (day<22 && month==12)){
                System.out.println("Yay Burcu");
            }
            if((day>21 && month==12) || (day<21 && month==1)){
                System.out.println("Oğlak Burcu");
            }
            if((day>20 && month==1) || (day<20 && month==2)){
                System.out.println("Kova Burcu");
            }
            if((day>19 && month==2) || (day<21 && month==3)){
                System.out.println("Boğa Burcu");
        }

    }

}
