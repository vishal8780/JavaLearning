package Method;

public class MoreAboutMethoda {

    //now will start using the method
    public static void meth1() {
        System.out.println("Good Morning brother");

        for (int i = 1; i <= 10; i++) {

            System.out.print(i+ " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        meth1();
        meth2();
        meth3();
    }

    // it does not matter where you are declare the method it will call using main method only so if you are calling meth1() first then will exic
    public static void meth2(){
        System.out.println("Good Morning brother");
    }
    public static void meth3(){
        System.out.println("kaise ho tm ");
    }
}

