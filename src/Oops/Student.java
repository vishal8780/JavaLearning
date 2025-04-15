package Oops;


class StudentTest{

    // properties of an object are called as entity

    public String name;
    public int rollNumber;
    public String courseName;
    public int m1,m2,m3;

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
         studentTest.name="Ramesh";
         studentTest.rollNumber=77;
         studentTest.m1=60;
        studentTest.m2=70;
        studentTest.m3=80;
        studentTest.courseName="CS";
        System.out.println(studentTest.total());
        System.out.println(studentTest.avarage());
        System.out.println(studentTest.grade());
        System.out.println(studentTest.details());

    }
}
