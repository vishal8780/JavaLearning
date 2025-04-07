package Method;

import java.util.Scanner;

public class ReturnType {
    public static int sum(int a, int b){
        /* what is return type ? basically it will return the datatype value which we used to define the method
        & also it will perform the operation n will return the value in method either will any data type*/
        return a+b;
        // and Return means function/ method will finish
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a no for int d");
        int d=scanner.nextInt();
        System.out.println("Enter a no for int c");
        int c=scanner.nextInt();
        System.out.println("sum of two no is "+ sum(d,c));
    }
}
