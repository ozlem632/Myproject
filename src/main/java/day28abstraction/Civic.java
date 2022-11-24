package day28abstraction;



public class Civic implements Engine,Ac,Hood{
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
        System.out.println("Uses tsi");

    }//bir clasi bir interfacenin childi yapmak icvin implements kullanilir


    @Override
    public void digital() {

    }

    @Override
    public void climate() {

    }

    @Override
    public void stell() {

    }
}




