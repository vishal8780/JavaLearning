package Method;

public class PassingArgument {
    public static void intro(String name, String clas,int age, String mob){
        System.out.println("Good morning "+ name + "your classs is " + clas+" and your age is "+age+" also check this your mob number "+mob);

    }
    public static void main(String[] args) {
        intro("Ramesh","12B",17,"7896526729");
        intro("Vishal","12C",20,"8090706050");

    }
}
