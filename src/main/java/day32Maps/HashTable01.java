package day32Maps;

import java.util.Hashtable;

public class HashTable01 {



        /*
        1)HashTable bir maptir
        2)HashTable entrSetleri herhangi bir siralamaya tabi tutmaz
        3)HashTable,HashMaplerden daha yavastir.Cunku HashTableler thread-safe ve synchronizedir.ayni zamanda cok is yapmak demek
        thread-safe.corba kaynarken salata yapmak gibi
        4)HashTablelerde value null olamaz,Key null olursa nullpointerexception atar
        5)HashTablelerde value nullolamaz value yi null  yaparsaniz Nullpointerexception verir
        tostring metpodu objeleri consolda detaylari ile gorebilmek icin claslarin icinde olusturulur

         */

        public static <HashTable> void main(String[] args) {

                Hashtable<String, Integer> countryPopulations = new Hashtable<>();
                countryPopulations.put("USA", 400000000);
                countryPopulations.put("Germany", 83000000);
                countryPopulations.put("Turkey", 90000000);
                System.out.println(countryPopulations);// {USA=400000000, Germany=83000000, Turkey=90000000}

                //countryPopulations.put(null, 90000000);// HashTable'larda key null olamaz. NullPointerException
                //countryPopulations.put("France", null);// HashTable'larda value null olamaz. NullPointerException

                 Hashtable<String ,Student>myStudents=new Hashtable<>();
                 //kendi olusturdugumuz classi yani studenti  data tipi olarak kullanabildik integer gibi string gibi
                myStudents.put("Math",new Student("Tom Hanks","th@gmail.com",21,true));

                System.out.println(myStudents);//math=clave,el resto=valor
                //tostring tum b ilgiyi verir ama sadece name gormek isteriz

                //Student name=myStudents.get("name");//boyle yaptik name yerine null verdi.get metodu keyle calisir o yuzden key
                //math yazmak lazim
                String name = myStudents.get("Math").name;//name string oldugu icin student yapamayiuz string yaptik data  tipini

                System.out.println(name);
                String email=myStudents.get("Math").email;
                System.out.println(email);





        }

}
