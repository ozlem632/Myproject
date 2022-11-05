package day25_exeption;

public class E02 {
    public static void main(String[] args) {


        String arr[]={"Ali","can ","Veli","Han"};
          getElementFromArray(arr,2);
          getElementFromArray(arr,0);
          getElementFromArray(arr,3);
          getElementFromArray(arr,4);





    }




    //bir string Arrayden indeks girerek eleman elde edebilmek icin metod olusturun
        public static void getElementFromArray(String arr[],int idx){
        try{
            System.out.println(idx);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index te bir problem meydana geldi"+e.getMessage());

            e.getStackTrace();
            System.err.println("array index te bir problem mehydana geldi");
        }








        }
    }

