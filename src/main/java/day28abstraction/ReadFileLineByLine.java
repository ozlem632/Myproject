package day28abstraction;

/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;boyle de olur
 */

import java.io.*;//sadece bu da olur
public class ReadFileLineByLine {//line satir satir oku demek
    /*
    Trow ile trows arasindaki farklar:
    1: Trow metodun bady si icionde kullanilir .Trows ise metodudun isim  kisminden sonra  kullanilir
    2:Trow dan sonra obje olustururuz.Trowstan sonra sadece exception clasin ismi yazilir
    3:Trow metodun icinde istediginiz yerde exception atmak icin kullanilir.Trows ise varolan checked exceptionu atar
    4:trowdan sonra bir tane exception olabilir.Trowstan sonra birden fazla exception olabilir



     */

    public static void main(String[] args) {
        readFileByLine();//bunu koymazsak calismazbu costructer
    }


    public static void readFileByLine(){//io input output kutuphanesi demek// alttaki new constructionun icine dosyanin adresini



        try {//try kullandigim icin trow kullanmadim
            BufferedReader br =new BufferedReader(new FileReader("src/main/java/day27exceptions/File.text")) ; //src path oluyor //parametre calistigi icin bagiriyor.Bufer fileReader objesi ile calisir

     String line = br.readLine();//catc clouse sectik coklu catch.//br.readline once yazdi sonra stringi ekledi//bunu objeyi okumasi icinyaptik
      while(line!=null) {
          System.out.println(line);
          line =br.readLine();//read line icin BufferRead metodu

      }

        } catch (FileNotFoundException e) {// ikinci bufferda kkirmizi cizgide bekleyip more dedik ve try catc sectik birinci de secilebilir
            System.out.println(" Ya path yanlis ya da silinmis - "+e.getMessage());//bunu yazinca java ulasacak dosyaya

        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya characterler var -" +e.getMessage());
        }
        //parantez icindeki obje.//parantez icindeki src ile baslayain daylerin oldugu text e sagtiklayip copy yapinca olur





    }

}
