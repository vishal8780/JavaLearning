package constructors;

//Constructors are same is class name it is not having any return type
// If constructors are not define then it compiler is calling default one
//

class Casr{
    private String model;
    private String year;
    public Casr(){
        this.model="Unknown";
        this.year="0";
    }
    public Casr(String m,String y){
        this.model=m;
        this.year=y;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}
public class CarsTest {
    public static void main(String[] args) {
        Casr casr = new Casr();
        System.out.println("Model  " + casr.getModel() + " year  " + casr.getYear());
        Casr casr1= new Casr("Mahindra Thar","2021");
        System.out.println("Model== " + casr1.getModel() +"Year==  " + casr1.getYear());

    }
}