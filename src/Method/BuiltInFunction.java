package Method;

import java.util.Scanner;

public class BuiltInFunction {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                int c= scanner.nextInt();
                int d=scanner.nextInt();
                int e=Math.max(a,Math.max(b,Math.max(c,d)));
//              int e=Math.max(a,Math.max(b,Math.max(c,d)));
                System.out.println(e);
    }
}
