package day23inheritancepolymorphism;

public class Animal {

    public void eat() {//parent clasda uygulanmasini begenmediginiz metodun uygulamasini
        //degistirip kullanmaya overlooding denir
        System.out.println("animals eat");


    }

    public int add(int a, int b) {

        return a + b;
    }

    public Integer multiply(int a, int b) {


        return a * b;

    }

public Animal create() {
        return new Animal();
    }//final metodlar override edilemezler
public final double divide(int a, int b){
        return a/b;




    }



}