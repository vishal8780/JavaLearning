package ScopeOfVariable;

public class VariableExample {
     // Static Variable which will be outside the method block
     public  static int staticVar=100;
    //Instance variable that will also be outside the block & inside the class
    int instanceVar=30;
    public void display(){
        // local variable which will be inside the block
        int a=10;
        System.out.println("Local Variable : " +a);
        System.out.println("Static Variable : " +staticVar);
        System.out.println("Instance Variable : " +instanceVar);
    }

    public static void main(String[] args) {
        VariableExample variableExample=new VariableExample();
        VariableExample variableExample1=new VariableExample();
        VariableExample.staticVar=120;
        variableExample1.instanceVar=412;
        System.out.println("Object one ");
         variableExample.display();
        System.out.println("Object two ");
        variableExample1.display();
    }

}
