package day22Inheritancepolyaorphisa;

public class Runner {


    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);



        Mammal cat2 = new Cat();
        System.out.println(cat2.a);
        System.out.println(cat1.b);


        Animal cat3 = new Cat();
        System.out.println(cat3.a);
        System.out.println(cat1.b);
        Cat cat4 = new Cat();
        cat4.eat();
        Mammal cat5 = new Mammal();
        cat5.eat();  //mammal eat


        // object olustururken objenin data tipini child classlardan secilmez
        // inheritance de variablleler secilirken java constractira bakar





        Animal cat6 = new Animal();





    }
}