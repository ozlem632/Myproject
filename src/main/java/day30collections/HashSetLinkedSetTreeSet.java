package day30collections;

import java.util.HashSet;

public class HashSetLinkedSetTreeSet {
    public static void main(String[] args) {
        /*
      collections basliogi altinda yeralir .List,Queue,Set
       Hash bir  tekniktir.birbirine benzemeyen codlar uretir ,bu da data unique yapar
        Nicin kullaniriz .Coklu ve tekrarsiz datalar icin kullanilir
        Rastgele siralama yapar,Eleman ekleme ve cikarma da indeks kullanmadigi icin kullanislidir.
        kimlik no gibi .HIZ ,TEKRARSIZ,SIRALAMA ONEMSIZ
*/
//add metodu
        HashSet<String> tcNo = new HashSet();//indeks kullanmaz
        tcNo.add("12345");//add  metodunda indekslisi yok
        tcNo.add("54321");
        tcNo.add("456789");
        tcNo.add(null);
        System.out.println(tcNo);





//varolan elemani eklerseniz hata vermez var  olan datanin ustune yazar
//clear metodu
//        tcNo.clear();
//        System.out.println(tcNo);
        tcNo.add(null);
        tcNo.add(null);
        System.out.println(tcNo);

    //remove metodu indeksiz

}

}

