package day23inheritancepolymorphism;

public class Math extends Courses {


public void practice(){

    System.out.println("solve question" );

}

public Math() {
    //super("X");
    System.out.println("consturucter 1");

}
    public Math(int a){
    this();//bu clasataki parametresis clasi kullan demek
    // ayni clasin icinde diger costructer kullan
     System.out.println("constructor 2" );


 }

        }