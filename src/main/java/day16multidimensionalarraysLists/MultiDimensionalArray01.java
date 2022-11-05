package day16multidimensionalarraysLists;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

        //Array veya collection varsa "for-each-loop"kullanmak ilk tercih olsun
        //array ve collection var ama index kullanmak lazimsa for each kullanmayalim
        //for-loop yada while loop veya do while loop kullanilir

        // Bir tane integer multidimensional array olusturunuz
        //Bu arraylerdeki sayilarin toplamini bulunuz
        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int sum = 0;
        for (int[] w : arr) {
            for (int k : w) {
                sum = sum + k;

            }

        }
        System.out.println(sum);
        // bir multidimensional arrayi normal arraye ceviren kodu
        //{{2 5 1} ,{ 32, 75}}// yeni array olusturduk
        int brr[][] = {{2, 5, 1}, {32, 75}};
        int toplam = 0;
        for (int[] w : brr) {// bu kisimda icindeki eleman sayisini bulduk once lenngtle
            toplam = toplam + w.length;
        }
        System.out.println(toplam);

        int idx = 0;
        int crr[] = new int[toplam];//uzunluk olarark[0,0,0,0,0]
        for (int[] w : brr) {// disardakini almak icin[[2,5,1] ,[32.75]]
            for (int k : w) {//sayilari almak icin
                crr[idx] = k;
                idx++;

            }
        }

        System.out.println(Arrays.toString(crr));

        //{{4,6,67},{12,45,67}}
        int arr1[][] = {{4, 6, 67}, {12, 45, 67}};
        int top = 0;
        for (int[] w : arr1) {

            for (int k : w) {
                top = top + k;


            }
        }
        System.out.println(top);

        int arr2[][] = {{2, 4, 6}, {2, 5, 7, 8}};
        int top1 = 0;
        for (int[] w : arr2) {
            for (int k : w) {

                top1 = top1 + k;

            }
            System.out.println(top1);

            int ele[][] = {{56, 12, 34,}, {34, 45, 45}};
            int top2 = 0;
            for (int[] w1 : ele) {
                top2 = top2 + w1.length;

            }
            System.out.println(top2);
            int idx1 = 0;
            int nueva[] = new int[top2];
            for (int[] w1 : ele) {// w1 {56,12,34}
                for (int k1 : w1) {// k1 icine de 56,12,34 gidecek
                    nueva[idx1] = k1;
                    idx1++;
                }

            }

            System.out.println(Arrays.toString(nueva));

            int ass[][] = {{23, 45, 67}, {45, 67, 56}};
            int top3 = 0;
            for (int[] w2 : ass) {
                top3 = top3 + w2.length;
            }
            System.out.println(top3);
            int yeni[] = new int[top3];
            int idx3 = 0;
            for (int[] w4 : ass) {
                for (int k4 : w4) {
                    yeni[idx3] = k4;
                    idx3++;
                }
            }

            System.out.println(Arrays.toString(yeni));
        }


    }


}