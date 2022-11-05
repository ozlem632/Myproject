package day22Inheritancepolyaorphisa;

public class Honda extends Car {



    public String color;

    public Honda(){
        super("White ", 54000);
        System.out.println("honda conctructor");

    }

    public Honda(String color){

        this.color = color;
    }
}