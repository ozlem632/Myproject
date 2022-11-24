package day32Maps;

public class Student {

    public String name;
    public String email;
    public int age;
    public boolean success;//basarilimi

    public Student(String name, String email, int age, boolean success) {
        this.name = name;//sag tiklayip costructor olusturduk hepsini sectik
        this.email = email;
        this.age = age;
        this.success = success;

    }

    @Override
    public String toString() {//bu kismi kapatirsak diger classda run yapinca sadece hashkod yazar
        return "Student[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                ']';
    }//bu clastan olusturdugumuz objenin detaylarini   herseyi yazdirir sag tklayip to string yaptik.

}




