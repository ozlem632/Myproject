package day16multidimensionalarraysLists;

public class MultidimensionalArray02 {

    public static void main(String[] args) {
        // Bir multidimensional arraydeki en buyuk ve en kucuk elemani veren kodu yaziniz
        int arr[][] = {{2,5,1} ,{83,75}};// bir max konteynir oluscak .tek tek elemanlari karsilastiracak
        int maxElement = arr[0][0];
        int minElement = arr[0][0];

        for (int[] w :arr){
            for(int k: w){
                maxElement = Math.max(maxElement, k);
                minElement =Math.min(minElement , k);


            }

        }
        System.out.println(maxElement);
        System.out.println(minElement);
        System.out.println(maxElement + minElement);

        int arr1[][] = {{23, 45, 67}, {45, 67, 56}};
        int maxEleman = arr1[0][0];
        int minEleman = arr1[0][0];
        for (int[] w : arr1 ){
            for (int k :w){
                maxEleman= Math.max(maxEleman,k);
                minEleman = Math.min(minEleman,k);
            }
        }

        System.out.println(maxEleman);
        System.out.println(minEleman);
        System.out.println(maxEleman +minEleman);
        Integer sayi = 45;



    }
}
