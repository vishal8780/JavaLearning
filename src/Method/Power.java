package Method;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int pow = 1;
        for(int i= 1;i<=b;i++){
            pow *= a;
        }
        System.out.println(pow);
    }
}
