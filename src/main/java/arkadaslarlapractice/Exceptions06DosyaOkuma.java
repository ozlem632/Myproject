package arkadaslarlapractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions06DosyaOkuma {
    public static void main(String[] args) {


        /*
        Bir txt dosyasinda 3. satirdaki ifadeyi consola yazdiran method (BufferedReader ile)
         */
        dosyaOkuma();

    }

    public static void dosyaOkuma(){

        try {

            BufferedReader br = new BufferedReader(new FileReader("src/exceptionscalismasi/Notlar"));

            String line = br.readLine();
            int i = 1;
            while(line!=null){
                i++; //2
                line=br.readLine();
                if(i==3){
                    System.out.println(line);
                    break;
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Dsya silnmis olabilir ya da dosya path yanlis");
        } catch (IOException e) {
            System.out.println("Tanimli olmayan karakter hatasi");
        }
    }
}












