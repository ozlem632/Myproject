package day06nestedifswitch;

import java.util.Scanner;

public class Switc01 {
    public static void main(String[] args) {


        /*
        kullanicidan guin sayisi aliniz ve gun ismini ekrana yazdiriniz
        1==> pazar    2==>Pazartesi

         */



        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz...");

        byte gunNo = input.nextByte();
        //1.yol: if ile cozunuz

        if (gunNo == 1) {
            System.out.println("Pazar");

        } else if (gunNo == 2) {

            System.out.println("pazartes");


        } else if (gunNo == 3) {
            System.out.println("sali");

        }else if(gunNo==4){
            System.out.println("carsamba");

        }else if(gunNo==5) {
            System.out.println("persembe");
        }else if(gunNo==6){
            System.out.println("cuma");


        }else if(gunNo==7){
            System.out.println("cumartesi");

        }else {
            System.out.println("Gecerli gun sayisi giriniz");
        }

            // 2.yol:swich ile cozunuz.If'in yaptigi bherseyi yapar. Daha sadedi.Case durum demek.break switchte kullani

        switch(gunNo){
                case 1:
                    System.out.println("Pazar");
                    break;
                case 2:
                    System.out.println("pazartesi");
                    break;
                case 3:
                    System.out.println("Sali");
                    break;
                case 4:
                    System.out.println("carsamba");
                    break;
                case 5:
                    System.out.println("Persembe");
                    break;
                case 6:
                    System.out.println("Cuma");
                    break;
                case 7:
                    System.out.println("cumartesi");
                default://bu durumlarin disinda
                    System.out.println("Gecerli gun sayisi gifriniz...");











            }

        }


    }
