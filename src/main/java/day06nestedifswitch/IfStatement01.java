package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //kullanicidan yas degerini alan kodu yaziniz ve yasin hangi evrede oldugunu asgidaki tabloya gore ekrana yazdir
        //0 - 4=> bebek
        //5 - 12=>cocuk
        //13 -20 =>genc
        //21 - 30=> ytiskin
        // tanimlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz...");
        byte yas = input.nextByte();
        if (yas < 0) {
            System.out.println("gecerli bir yas giriniz..");


        } else if (yas <= 4) {// eger sayilari 4 13 21 31 dersek yine olur esitligi kaldiririz
            System.out.println("bebek");
        } else if (yas <= 12) {
            System.out.println("cocuk");
        } else if (yas <= 20) {
            System.out.println("Genc");

        } else if (yas <= 30) {
            System.out.println("yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre");


        }


    }


    }

