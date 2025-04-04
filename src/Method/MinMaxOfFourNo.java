package Method;

import java.util.Scanner;

public class MinMaxOfFourNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));
        System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));


    }
}
