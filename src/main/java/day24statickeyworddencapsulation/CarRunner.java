package day24statickeyworddencapsulation;

public class CarRunner {
    public static void main(String[] args) {
        // Static Class Nedir?
// Değişiklik yaptığınızda tüm objeler etkileniyorsa ona static denir.
// Değişiklik sadece bazılarını etkiliyorsa buna non-static denir.
// Static olmayanlar objeye bağlı,static olan Class a bağlıdır.
// Static keyword Class a bağlanmış Class elemanlarıdır.Static keyword ve method variable'lara bağlı.
// Tüm objelerin ortak elemanıdır.Static Class elemanları her objenin ortak elemanıdır.
// Static lder üzerinde yapılan değişiklikler,
//tüm objelrden görülür.Static class elemanlarına class üzerinde ulaşılır,
//objeler üzerinde ulaşılması tavsiye edilmez.Static ler Override edilemez çünkü tüm objeler bundan etkilenir.
        Car car1=new Car();//car clasindan obje olusturduk
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();//car clasindan 4 tane obje olusturduk
        System.out.println(car1.counter);
        //static olanlar ay gibidir.degisim herseyi etkiler .static olani classa baglayacagiz
        //static olmayan objeye baglanir-car1,car2,car3 price bunlara bagli.priceyi static yapmadik
        //int x;eger public yoksa defaulttur
        //newkwewordunu gorunce obje olusturdugunu anla
        // static variablelara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez//staticler overlidd edilemez
        System.out.println(car1.counter );
        System.out.println(Car.counter);
        System.out.println(car1.price);
        System.out.println(Car.counter);
        System.out.println(car2.price);
        System.out.println(Car.counter);
        System.out.println(car3.price);
          /*
         static keyword nedir?
          static keyword class'a baglanmis class elemanlaridir
         static class elemanlari butun Object'lerin ortak elamanidir.
       static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
        static Class elemanlarina Class uzerinden ulasilir.

         */




    }
}
