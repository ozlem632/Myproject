package arkadaslarlapractice;

public class EmreHocaExepception {
    public static void main(String[] args) {

              /*
        Verilen bir Stringin karakter sayisini ekrana yazdirip ardindan String i integer a cevirip yazdiran method.
         */


        f1(null);
        f1("ABc");


    }
    private static void f1(String str){
        int karakterSayisi;
        int yeniString;

        try {
            karakterSayisi=str.length();
            System.out.println("Karakter Saysi:"+karakterSayisi);
            yeniString=Integer.valueOf(str);
            System.out.println("Yeni deger:"+yeniString);
        }catch (NullPointerException e){
            System.out.println("String null olamaz -->"+e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("String sadece rakamlari icermelidir.---"+e.getMessage());
            System.err.println("String sadece rakamlari icermelidir.");
            e.printStackTrace();

        }
    }

}