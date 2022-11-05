package day21accesmodifiersinheritance;



public class Animal  {

        //inheritance miras demek
        protected  void eat(){
            System.out.println("animals eat");

        }

           public void drink(){
               System.out.println("animals drink");//animal-mammals-cat-vancat bu sekilde siralanmaya multilevel inheritance denir
               // animal-mammal-cat+dog+bird buna da hierarchical inheritance denir ,hiyerarsik
               //anne baba cocuk buna da multiple inheritance kullanamayiz java dajava bunu desteklemez
               //javanin kafasi karisacagi icin iki tane parent kabul etmez


           }


        }


