package Oops.DataHiding;
class AadiSir{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Adi {
    public static void main(String[] args) {

        AadiSir aadiSir= new AadiSir();

        aadiSir.setName("Aaditya Yadav");
        aadiSir.setAge(24);
        System.out.println( aadiSir.getAge());
        System.out.println(aadiSir.getName());
//

    }

}
