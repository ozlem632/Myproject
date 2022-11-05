package day03typecastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {

        /*
           Note: Jva primitive lere methodlar ekleyerek yeni bir yapi olusturuldu
           Bu yapiya "Wrapper Class" diyoruz

           Primitive          Wrapper
                byte    ==>   Byte
                short   ==>   Short
                **int   ==>   Integer
                long    ==>   Long
                float   ==>   Float
                double  ==>   Double
                ** char ==>   Character

         */
        byte primitiveByte = 12;// "primitiveByte " yazip nokta koydugumuzda hic method goremezsinis
        //Cunku primitiveler method icermez,sadece deger icerir
        Byte wrapperByte = 12;// "wrapperByte yazip nokta koydugumuzda bir cok method gorursunuz
        //Cunku "wrapper"lar method icerir

        //Example 1: byt data type'inin en kucuk ve en buyuk degerlerini ekrana yazdirin
        System.out.println(Byte.MIN_VALUE);//.128
        System.out.println(Byte.MAX_VALUE);// 127


        //Example 2: short ,int,long data type'larinin en buyuk ve en kucuk degerlerini ekrana yazdirin
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);// 32768

        System.out.println(Integer.MIN_VALUE);// -2147483648
        System.out.println(Integer.MAX_VALUE);// 21474836648

        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);//9223372036854775807

        //"primitive"ler nasil "wrapper"lara cevrilir(Autoboxing)
        float f1 = 13.99F;
        Float wrapperF1 = f1;

        // "wrapper"lar nasil primitive cevrilir(Unboxing)
        Character w1 = 's';
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing Java tarafindan otomatik yapilir








    }
}
