package Oops.DataHiding;


class StudentTest{

    // properties of an object are called as entity

    private String name;
    private int rollNumber;
    private String courseName;
    private int m1,m2,m3;

    public int getM3() {
        return m3;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Behaviour of the object is called as method
    public  int total(){
        return m1+m1+m3;
    }
    public int avarage(){
        return (int) ((float) total()/3);
    }
    public char grade(){
        if(avarage()>=60)
            return 'A';
        else
            return 'B';

    }
    public String details(){
        return  "Rollno " + rollNumber + "\n"+"StudentName "+ name+ "\n"+"StudnetCouse "+courseName ;

    }
}

public class Student {
    public static void main(String[] args) {
        StudentTest studentTest=new StudentTest();
        studentTest.setName("Ramesh");
        studentTest.setRollNumber(77);
        studentTest.setM1(60);
        studentTest.setM2(70);
        studentTest.setM3(80);
        studentTest.setCourseName("CS");
        System.out.println(studentTest.getCourseName());
        System.out.println(studentTest.total());
        System.out.println(studentTest.avarage());
        System.out.println(studentTest.grade());
        System.out.println(studentTest.details());

    }
}
