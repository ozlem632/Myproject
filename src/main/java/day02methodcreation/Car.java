package day02methodcreation;



public class Car {

    public String marca = "Honda";
    public int fiyat = 20000;


    /*

        Note: Class  ==> Variables ==>  Object ==>   kullanacagiz
                         Method

    */


    public static void main(String[] args) {

        //Object nasil olusturulu?
        //1)Class ismi  2)Objeye isim  3)=     4)new keywordu kullan    5)Class ismi parantez(Constructor)

              Car          myHonda       =             new                          Car();

        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marca);// Honda
        myHonda.hareketEt();
        myHonda.dur();


        // MethodCreation class'indan object olusturduk
        MethodCreation obj = new MethodCreation();

        System.out.println("obj.toplamaYap(3,5) = " + obj.toplamaYap(3,5));



}




    public void hareketEt(){
            System.out.println("Honda guzel hareket eder...");
    }
     public void dur(){
         System.out.println("Honda guvenli durur....");
  }


}