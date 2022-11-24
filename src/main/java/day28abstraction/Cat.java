package day28abstraction;

public class Cat extends Mammal{

    /*
    Bir method "parent classda"abstract ise child class o methodu"override edip kullanmak zorundasinizdir
    Bu yuzden herhangi bir fonksiyonu child class icin mecburi yapmak isterseniz o methodu abstract yapmalisiz.
    Browser tarayici.Navigate .nevigate

     */
    @Override
    public void move() {
        System.out.println("Cats move");
    }

    @Override
    public void eat() {
        System.out.println("Cats move");


    }
}
