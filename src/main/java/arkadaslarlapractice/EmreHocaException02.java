package arkadaslarlapractice;

import java.util.Arrays;
import java.util.Scanner;

public class EmreHocaException02 {
    public static void main(String[] args) {

   /*
        Verilen bir String array de bulunan urunu elde edebilmek icin kod yazma.
         */
        Scanner scan = new Scanner(System.in);
        String [] str ={"Elma","Armut","Kiraz"};
        System.out.println(Arrays.toString(str));
        System.out.println("Bir sira no giriniz.");
        int siraNo;


        try {
            siraNo= scan.nextInt();
            System.out.println(str[siraNo]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index sinirlari disi sira no girisi hatasi --- "+ e.getMessage());
        }

    }
}



