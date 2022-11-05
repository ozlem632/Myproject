package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //exp. 1: anlik tarihi (current date) ekrana yazdiran kodu yaziniz

        LocalDate currentDate = LocalDate.now();// biulundugumuz mekanda anlik tarih
        // new kwywordu ile sifirdan obje olusturulur .birde varolan objeyi kullaniriz
        System.out.println(currentDate);// 2022-10-21// tarih
        // exp:2:
        LocalTime currentTime = LocalTime.now();//saat
        System.out.println(currentTime);
        //exp:3:anlik tarihi ve anlik zzamani yazin
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        //exp;4; Japonyadaki anlik tarihi
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);
        //exp:5: istanbuldaki anlik tari
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        // exp;6:  bugunden sonra 789 gun  sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kod
        LocalDate countDate = LocalDate.of(2022, 10, 21);// bu ise herzaman icin
        //LocalDate currentDate2 =LocalDate.now();// bu bugun icin gecerli ama yarin ayni kalir o yuzden geriye sayim yapmali bunu degistirmeliyiz
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);
        // exp:7: iki cocugun dogum tarihleri arasindaki farki gun olarak hesaplayan kodun  yaziniz

        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);
        //between metodu kullanildiginda daha eski olan tarih yazilmalidir


        // exp:8: ist fethi ile cumhuriyetin kurulmasi arasin da kac ay old gostern kodu yaziniz
        LocalDate istanFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumKur = LocalDate.of(1923, 10, 29);
        long aySayisi = ChronoUnit.MONTHS.between(istanFethi, cumKur);
        System.out.println(aySayisi);//5645
        // exp:9: verilen tarih hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 4, 22);


        int day = myDate.getDayOfMonth();// bu gun icin
        int month = myDate.getMonthValue();// bu ay icin


        //1.Yol:
        if(day>=21 && month ==3){
            System.out.println("koc");

        }else if(day<=20 && month == 4){
            System.out.println("koc");// bunun icin calisti digerleri icinde calisir

        }



        }

        }




