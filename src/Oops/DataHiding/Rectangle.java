package Oops.DataHiding;
class RectangleTest{
    private  int length;
    private int breath;

    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }
    public void setLength(int l){
        if (l>0)
        length=l;
        else
            length=0;
    }
    public void setBreath(int b){
        if (breath>0)
                breath=b;
        else
            breath=0;
    }
    public int area(){
        return length*breath;
    }

    public int sqr(){
        return 2*(length*breath);
    }
}
public class Rectangle {
    public static void main(String[] args) {

        RectangleTest rectangleTest=new RectangleTest();
        rectangleTest.setLength(10);
        rectangleTest.setBreath(-20);
        System.out.println("Area " + rectangleTest.area());
        System.out.println("Square " + rectangleTest.sqr());
        System.out.println(rectangleTest.getLength());
        System.out.println(rectangleTest.getBreath());

    }
}



