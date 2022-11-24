package day28abstraction;

public class Accord implements Engine,Ac,Hood {
    @Override
    public void eco() {
        System.out.println("Uses eco engine");

    }

    @Override
    public void gas() {
        System.out.println("Uses gas");

    }

    @Override
    public void tsi() {
        System.out.println("uses tsi technology");


    }

    @Override
    public void digital() {
        System.out.println("Uses digital Ac");

    }

    @Override
    public void climate() {
        System.out.println("Uses climate technology");

    }

    @Override
    public void stell() {

    }
    // engine motor demek.Farkli fonksiyonlari var.eco,gas,tsi.Ac.demek clima fonksiyonu :digital,climate(iklimlendirme)
    //hood() kaporta.Steel(celik).atomik olmasi icin parenti parcaladim ,Ama bir childin birden fazla parenti oldu.Cunku java
    //multiple inheritance desteklemez.Bu  claslar icin gecerli.Jva yeni  bir yapi yapti.Multiple inheritance classlarda mumkun degil.fakat
    //interface de mumkun


}
