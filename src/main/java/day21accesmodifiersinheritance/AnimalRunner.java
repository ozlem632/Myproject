package day21accesmodifiersinheritance;


public class AnimalRunner {
    public static void main(String[] args) {// diger methodlar objectclasdan geliyor
      /*
      1)inheritance sayesinde
         i)code tekrarindan kurtuluruz
         ii)code tamiri (maintanance) kolay olur
         iii)Child classlari daha atomic olur
      2)bir class i baska bir classin child classi yapmak icin "extends"keywordu kullanilir
      ilk yazilan class child ikinci yazilan class parent olur
      3) Child class objectleri parent classdan method ve variableleri kullanabilirds 
      4)Parent CLAS Objeleri chilmethod ve variableleri kullanamaz,
      5)Object class her clasin parentidir.java da object class haric her clasin parenti vardir
      6)private method ve variable lar child  classtarafindan kullanilamz
      privatelar inheir yaplamaz
      "default method ve  variableler ayni package deki child claslar tarafindan kullanilabilir kullanilir
      public method ve variableler child classlar tarafindan kullanilabilior
      7) 4 tip inheritance vardir
          i)multilevel inheritance :java kabul eder
          ii)hierarchical inheritance:java kabul eder

          

       */
       
       
        Cat c1 = new Cat();
        c1.meov();
        c1.eat();
        c1.drink();
                
        Bird b1 = new Bird();
        b1.eat();
        b1.tweet();
        b1.drink();
        
        Dog d1 =new Dog();
        d1.bark();
        d1.drink();
        d1.eat();
        Animal a1 = new Animal();


        
        
    }


}