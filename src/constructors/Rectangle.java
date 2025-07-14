package constructors;
class RectangeleTest{
    private double lenght;
    private double breadth;
    public RectangeleTest(){
           lenght=1;
           breadth=1;
    }
    public RectangeleTest(double l, double b){
        lenght=l;
        breadth=b;
    }
    public RectangeleTest(double s){
        lenght=breadth=s;
    }
    public double area(){
         return lenght*breadth;
    }

}
public class Rectangle {
    public static void main(String[] args) {
        RectangeleTest rectangele1=new RectangeleTest(10,9);
        System.out.println(rectangele1.area());


    }
}
