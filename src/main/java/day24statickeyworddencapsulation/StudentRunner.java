package day24statickeyworddencapsulation;

import java.sql.SQLOutput;

public class StudentRunner {


    public static void main(String[] args) {
        Student std1 = new Student();//clasa ulasmak icin obje olusturduk


        System.out.println(std1.getSdId());// Th202201
        System.out.println(std1.getGpa());
        System.out.println(std1.isRetired());
        std1.setSdId("AB");

        System.out.println(std1.getSdId());
        std1.setGpa(4.0);
        System.out.println(std1.getGpa());
        std1.setRetired(true);
        System.out.println(std1.isRetired());




    }
}
