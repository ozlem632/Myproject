package arkadaslarlapractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmreHocaExc03 {



         /*
       Kullanicidan 4 haneli int data type inda kimlik no aliniz. ILgili exceptions durumlarini handle ederek bir method ile yapiniz.
        */
        public static void main (String[]args){
            f2();
        }

        public static void f2 () {
            Scanner scan = new Scanner(System.in);
            System.out.println("4 haneli TC noyu giriniz:");


            try {
                int TC = scan.nextInt();
                if (TC < 1000 || TC > 9999) {
                    throw new IllegalArgumentException("TC no 4 haneli olmalidr.");
                } else {
                    System.out.println("TC No:" + TC);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                f2();
            } catch (InputMismatchException e) {
                System.out.println("TC no sayisal degerler olmalidir.-->" + e.getMessage());
                f2();
            }
        }

    }
