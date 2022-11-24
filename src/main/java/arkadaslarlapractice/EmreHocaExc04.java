package arkadaslarlapractice;

import java.util.Scanner;

public class EmreHocaExc04 {



        static String password ="253AB";
        public static void main(String[] args) {
            //Kullanici passwordunu database den kontrol edip baglantiyi kesen(finally) ve ilgili exception i bizim olsurturdugumuz ve handle
            // ettigimiz bir method.

            try {
                f3();
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Baglanti kesildi.");
            }


        }

        public static void f3() throws PassException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Password girniz:");
            String pass = scanner.next();
            if(!pass.equals(password)){
                throw new PassException("Password yanlis");
            }else {
                System.out.println("Basarili giris.");
            }
        }


    }