package Method;

public class sumOperation {

    int add(int a , int b ){
        int sum=a+b;
        return sum;
    }

    int sub(int c , int d ){
        int sub1=c-d;
        return sub1;
    }

    int mul(int e, int f) {
        int mul1=1;
        for (int i = 1; i <= f; i++) {
             mul1 = e* i;
            System.out.println(e + " * " + i + " = " + mul1);
        }
        return mul1;

    }

    int div(int g , int f ){
        int div11=g/f;
        return div11;
    }
    public static void main(String[] args) {
        sumOperation sbcd= new sumOperation();
        int additon=sbcd.add(12,18);
        System.out.println(additon);
        int subtraction = sbcd.sub(90,80);
        System.out.println(subtraction);
         sbcd.mul(40,10);
//        System.out.println(multiplication);
        int div= sbcd.div(12,3);
        System.out.println(div);

    }
}
