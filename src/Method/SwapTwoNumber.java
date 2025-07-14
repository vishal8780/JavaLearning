package Method;

import java.util.Scanner;

public class SwapTwoNumber {
    public  static  void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap num  "+a+ " "+b);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                int c= scanner.nextInt();
                int d=scanner.nextInt();
                swap(c,d);
       // System.out.println(swap(c,d));
    }
}
