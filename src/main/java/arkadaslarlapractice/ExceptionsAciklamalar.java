package arkadaslarlapractice;

public class ExceptionsAciklamalar {
   /* Exceptions;
    Java da beklenmedik durumlar olarak aciklaniyor. Hangi durumlarda exception?
            - Yazilan kodlardan kaynakli exception,
  - Kullanicidan kaynakli, uygun olmayan degerler girmesi sonucu
  - Baglantinin kopmasi gibi ongorulemeyen hatalarda exceptions lar olabilir.
            ​
    A)Exceptions Types;
1)Compile Time(Checked) Exceptions
    Kod yazildiginda javanin ongordugu olasi sorunlardir. Kirmizi cizgi ile uyari aliriz. Compile Time Error ile
    karistirmamak gerekiyor. FileNoteFoundException, IOException vs.
            ​
            2)Run Time(UnChecked) Exceptions
    Kodlarimizi yazdiktan sonra calistirdigimizda ortaya cikar.
            ​
    B)Ihtiyaca/gereksinimlere/duruma/kod gerekliligine gore Exceptions larda 2 yontem kullanabiliriz;
​
    i) "Try catch". Bununla exception olussa dahi kodlarimizin calismasini saglariz.Normalde java bir problemle karsilastiginda calismasini durdurur.
    try catch ile handle ederek javanin devam etmesini istiyoruz.
​
        try{
        olasi hata durumuna sahip kod ya da kodlar
        yukarida hata durumu varsa, buradaki kod satirlari okunmaz.
    }catch(ExceptionType e){                                      ==> e, ExceptionType data type na sahip variable ismidir.
        hata mesajlari (Tum bu hata mesajlarindan sonra kodlar calismaya devam eder.)
        -System.out.println(); bizim yazdigimiz teknik olmayan hata mesaji.Consolda, yazildigi kod siralamasina gore gorunur.
        -System.out.println(e.getmessage()); hatanin kaynagini belirten teknik mesaj.Consolda, yazildigi kod siralamasina gore gorunur.
        -System.err.println(); bizim yazdgimiz teknik olmayan ve renkli cikti veren mesaj.Consolda en altta gorunur.
        -e.printStackTrace(); exception ile ilgili detayli teknik bilgi verir. Consolda en altta gorunur.Developperlar bir hata aldiginda once
        bu log lara bakar. Bu log lar bize kodlari isleyisini asama asama gosterir.
​
    }catch(ExceptionType e){      ==>Ayni anda birden fazla exception atilmaz.Yani eger bir ust catch de exception yakalanmissa. Sonrasinda gelen
  	                              catch lerdeki exception lar atilmaz.
        hata mesajlari            ==>Eger catch lerde parent child iliskisi olan Exception lar kullandiysak parent olan en alta yazilmalidir.Yoksa
        hata aliriz.
    }catch(ExceptionType e){
        hata mesajlari
    }
​
    ii) "throw" ile hatayi yakalar ve calismayi durdururuz. Mesela, kodlarimizin bir dosya uzerinde okuma yapmasi gerekiyor ve ilgili dosya bulunamiyorsa
    kodlarimizin daha sonrasinda calismasina gerek yoktur ve calisma durdurulur.(Dosya silinmis olabilir ya da dosya baglanti adresi yanlis girilmis olabilir.)
    Cunku app nin daha sonrasi bu dosya icerigine bagliydi.Yani calismanin devam etmesine gerek yok.Bu durumda "throw" kullanabiliriz.
            Bu ikisinin(try-catch ile throw) arasindaki fark ilkinde kod devam eder digerinde devam etmez.
            ​
            ​
            ​
            ***Run Time(UnChecked) Exceptions***
    a)  ArithmeticException
    Bolum durumunda bolenin sifir olmasi gibi matematiksel islemlerde ortaya cikar. Java da matematik ile ilgili tum istisnalar/hatalar bu class dadir.
    ArithmeticException: / by zero                                    ==> Exception turu, Exception nin kaynagi(Bolme islemi "/" ve "sifir")
    at ders25exceptions.Exceptions01.divide(Exceptions01.java:11) ==> Sorunun  oldugu kod satiri
    at ders25exceptions.Exceptions01.main(Exceptions01.java:7)    ==> Sorunun  oldugu kod satiri
​
    b)  ArrayIndexOutOfBoundsException
    Bir array in index i ile ilgili bir islemde, index sinirlari disinda bir deger soz konusuysa aliriz.
            ​
    c)  InputMismatchException
    Kullanici veri girisinde istenen data type indan farkli bir giris yapmissa aliriz. int girmesi gerekirken String bir karakter girmesi gibi.
            ​
    d)  NullPointerException
    null objesini uygun olmayan bir komutla kullanirsak bu exception i aliriz. Mesela null atanan bir String in length() ini almak gibi.
            ​
    e)  NumberFormatException
    Sayisal degere sahip olmayan bir String, int double gibi sayisal degerlere cevirirsek bu Exception i aliriz.
​
    f)  StringIndexOutOfBoundsException
    Bir String in index sinirlarini asarsak bu exception i aliriz. Mesela bir String in 9. karakterini almak istiyoruz ancak
    String 9. karakteri icermiyor.
            ​
    g)  ClassCastException
    Bir datayi casting yapilamayacak bir dataya cevirmek istedigimizde bu exception i aliriz.Mesela Object data type na sahip bir degeri String data ya
    casting yaparsak.
            ​
    h)  IllegalArgumentException
    Uygun olmayan deger hatasi. Kullanici normal sartlarin disinda bir deger girerse. Mesela bir yas icin negatif bir deger girilmesi kullaniriz.
            Hangi durumlarda;
    App nin ilk mimarisini olusturanlar hangi durumlarda app nin durmasi gerektigini belirtirler. Boylece developper lar ilgili yerde "throw" kullanabilirler.
    Yeni yazilacak kodlari bu sarta gore olustururlar. Mesela "throw" u daha sonra try catch ile handle etmek gibi.
    Gunluk hayatta yasak ancak Java icin yasak olmayan seylr soz konusuysa yine method icinde exception atmaliyiz. Mesela pi sayisi 3 olmasi isteniyor,
3 den farkli bir deger ihtimaline karsi, developperlar IllegalArgumentException kullanarak bunun onune gecebilir.
​
        "throw" keywordu ile IllegalArgumentException sinifindan object olusturark kullaniriz.Ve ilgili mesaji parametre olarak constructor da belirtiriz.
            throw new IllegalArgumentException("Message..");
    e.getMessage(), daha sonra kullanirsak constructor da belirttigimiz mesaj i aliriz.
    Burada biz "throw" u  diyelim ki bir method icinde kullaniyoruz ve new IllegalArgumentException("Message..") yazarak object olusturup, dolaysiyla
    method icinde Exception olusturmus oluyoruz.
​
    j)RuntimeException a extends ederek olusturdugumuz exceptions lar(Custom Exceptions)
    Sinif olustururuz. Constructor imizi olustururuz.
    public IllegalNameException (String message){
        super(message);
    }
    Olusturacagimiz methodda olusturdugumuz exception i throw edersek yine Compile time Exception uyarisi almayiz. Cunku bu Run Time Exception dir.
    Sonra gerekli adimlari yapariz.
            ​
            !!!!!!finally code block!!!!!!!
    Application larin database i genelde cloud dadir. Ve bu cloud her kullanildiginda ucret talep edilir. Bu nedenle app nin database/cloud ile olan
    islemi sonrasi baglanti kesilmelidir. Boylesi bir durumda "finally" kullanilir. "finally", "try-catch "ler ya da sadece "try" ile beraber kullanilir.
    Diyelim ki, kullanci password u database deki ile eslesse de eslesmese de bu baglanti kesilmelidir. Dolaysiyla "finally" codeblock
    her durumda calismalidir.
    Diyelim ki bir method icindeki code lar database ile connection icin, iste bu baglantiyi kesmek icin finnally code block kullanilir ve icine
    kesim icin hangi kodlar yazilmasi gerekiyorsa o kodlar yazilmalidir.
​
    Javada, final, finally, finalize keywordleri birbirne benzer.
            ​
            1)final bir keyworddur.Variable, class ve methodlar icin kullanilir.Detaylari daha once anlatildi.
            2)finally, bir kod block dur.
            "try-catch" veya sadece "try" ile kullanilir.
            "finally" kod block icine yazilan kodlar her halikarda calistirilir.
            3)"finalize" bir methoddur. Bu method java tarafindan datalar imha edilmeden once cagrilir, bu method data lari imha edilecek hale getirir
    ve daha sonra "Garbage Collector" bu data lari imha eder.
        "finalize" methodunu Java Developper larda cagirabilir ancak Java kendi bildigini yapar.
            ​
            ​
    Note:App da bize requieremend documentlarda bize hangi durumlarda hangi hatalara nasil tepki verilecegi belirtiliyor. Dolaysiyla cozum icin ilgili
    exception kullanilir.
            ​
            ***Compile Time(Checked) Exceptions***
    Run butonuna basmadan once kodlari yazarken soz konusu olan exception lardri. Compile Time(Checked) Exceptions kesinlikle halledilmelidir/handle
    edilmelidir.
​
    a)FileNotFoundException, IOException
    File lardan data almak icin "FileInputStream" class ini olusturmustur. Bir nehir gibi data yi almak icin tum karakterler pesi pesine alinir.
    Bu datayi almak icin once parametresi dosya yolu olan bir object olustururuz.
    Bu yolu yazdiktan sonra da java hata vermeye devam eder.Burada java ilgili adresin yanlis olmasini veya ilgili adreste dosya yoksa durumunu
    bize hatirlatir. Burada method imzasi icin FileNotFoundException ekliyoruz.Yani javanin bizi uyardigi durumlar icin exception atiyoruz.
            "Add exception to method signature" seciyoruz.
    Bir dongu ile object imizi read() ile kullanarak data mizi carakter carakter aliriz(Burada ASCII ler calisir) ve yazdiririz.
    Bir karakter kalmayincaya kadar dongu read() methodu ile taramayi saglar ve karakter kalmayinca read() bize -1 donderir. Bu nedenle dongu kosulunu
    buna gore belirlemeliyiz. Ayrica burada read() methodu ile java bize icinde ASCII tabloda yer almayan karakter olma durumu nedeniyle yine bir
    uyarida bulunur.
    Bu uyari icin de exception atmak gerekir.Bunun icin yine "Add exception to method signature" secerek IOException atariz.Bu durumda onceki exception
    FileNotFoundException in yerini IOException alir.Cunku IOException, FileNotFoundException i kapsar ve parentidir. Dolayisiyla FileNotFoundException a
    gerek yoktur.
    Exception atan methodlar main icinde kullanildiklarinda mutlaka main method signature une de eklenmelidir.
​
    IOException, Input/Output Exception dir. Input ve output ile ilgili tum problemleri halleder.
            ​
    Dosya okumada, problemi try/catch kullanarak handle etme;
    Once parametresi dosya yolu olan bir object olustururuz.Bu yolu yazdiktan sonra da java hata vermeye devam eder.Burada java, ilgili adresin
    yanlis olmasini veya ilgili adreste dosya yoksa durumunu bize hatirlatir. Burada surround ediyoruz avec try/catch.
    Daha sonra read() methodu ile java bize icinde ASCII tabloda yer almayan karakter olma durumu nedeniyle yine bir uyarida bulunur. Bunu handle etmek
    icin IOException sinifini kullanarak bir catch daha ekliyoruz. Ya da burada sadece tek bir catch ile IOException de kullanabilirdik.
    Bu ikinci durumda methodun ya da methodun kullanildigi main methodun signature unde "throws" kullanmaya gerek yoktur. Burada hata durumu sonrasi
    java ya cozum olarak ne yapilacagini belirtiyoruz.

    Bu ikisnden hangisi kullanilmali? Verilen gorevde hata durumunda app nin durmasi isteniyorsa birincisi, hata olmasi durumunda app durmadan
    baska adrese gitmek gibi bir durum isteniyorsa ikincisi kullanilabilir. Ikinci durum daha cok kullanilri.

    b)Exception class ina extends edilen olustrudugmuz Exceptions class lar. (Custom Exceptions)
    Java da kendimiz kurallar belirleyip exceptions lar olusturabilirz. Bunun icin class olusturup bu class i extends ederiz Exception class dan.
    Daha sonra constructor imizi olustururuz.

    public IllegalGradeException (String message){
        super(message);
    }

    Olusturacagimiz methodda olusturdugumuz exception i throw edersek yine Compile time Exception uyarisi aliriz. Sonra gerekli adimlari yapariz.
            ​
            ​
            ******Custom Exceptions******
            1)Java Exception lar olusturarak Developperlarin Java kurallarina uymalarini temin etmistir.
            2)Biz de Application uretirken kendi Exception larimizi olusturarak diger Developper larin bizim ortaya koydugumuz
    kurallara uymalarini temin ederiz.
            3)Java nin degil, bizim urettigimiz Exception lara "Custom Exception" denir.
    4)Custom Exception larda "RunTimeException" ve "CompileTimeException" olabilir.
    5)Custom "RunTimeException" uretmek icin "extends RunTimeException" deriz
    6)Custom "CompileTimeException" uretmek icin "extends CompileTimeException" deriz
    */

}
