package Method;

import java.util.Scanner;

public class Combination {
    public static int fact(int x){
        int xfact=1;
        for (int i=1; i<=x; i++){
            xfact*=i;

        }
        return xfact;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number of n ");
        int n=sc.nextInt();
        System.out.println("Enter a number of r ");
        int r=sc.nextInt();
        int nFact=fact(n);
//        for (int i=1;i<=n;i++){
//                 nFact*=i;
//        }
//        int rfact=fact(r);
//        for (int i=1;i<=r;i++){
//            rfact*=i;
//        }
//        int nmrFact=fact(n-r);
//        for (int i=1; i<=n-r;i++){
//            nmrFact*=i;
//        }
        int ncr=fact(n)/(fact(r)*fact(n-r));
        System.out.println("combination of the number is " + ncr);

    }
}
