package day24statickeyworddencapsulation;




// birseyi capsule koymaya encapsulation denir"Data Hiding (gizlemek) demektir.
//Dta yi nicin gizlersiniz.Datayi dis etkenlerden korumak icin .
// Datayi nasil gizlersin.Acceess modifieri "private yaparak gizlenir
//Datayi gizledikten sonra baska claslardan okumak isterseniz ne yaparsiniz?
//get(getter) metodlar olusturarak gizledigimiz datalari okunur hale getirebiliriz.
//Datayi gizledikten sonra baska claslardan degistirmek istersen set metodlar olusturarak gizledigimiz datalari
//degistirebiliriz.(Stter)
//variablenin data type ile get metodun return type ayni olmalidir
//get metodlari isimlendirirken get variable name ancak variablenin data type boolean ise is ile baslar
public class Student {
    public String stdName="Tom Hanks";
    private String sdId="TH202201";
    private double gpa =3.8;//gpa ortalama demek//sag tkla generate getter sift ve ok tusuyla hepsini isaretle

    private boolean retired =false;

    public void setSdId(String sdId) {//set metodu return type voiddir cunku birsey vermez sadece degistirir
        this.sdId = sdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;//burdakini degistir demek this
    }

    public void setRetired(boolean retired) {//set metod parametre ile calisir
        this.retired = retired;
    }

    public String getSdId() {
        return sdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {//booleanlarda is le digerleri get yer alir
        return retired;
    }
}
