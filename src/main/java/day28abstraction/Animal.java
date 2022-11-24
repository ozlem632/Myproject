package day28abstraction;

public abstract class Animal {
//method var body yoksa abstrac metod olur
    // parent classin icindeki metodu child claslar degistiriyor.parentteki kullanilmayann kod oluyor.bodysi kullnilmiyor yazma
    //eat() bodysiz metpod abstroction metod
    //Bir metodu abstract yapmak icin body sil ve abstract kewordunui kullan
    //class ismi de abstract olmalidir
   public abstract void eat();//bodysi olm icin ab
    public void drink(){
        System.out.println("Animal drink..");

    }

    //Abstract move methodu olusturunuz
    public abstract void move();//abstract claslarda hem abstract hem de concrete (non-abstract) kullailabilir


}
