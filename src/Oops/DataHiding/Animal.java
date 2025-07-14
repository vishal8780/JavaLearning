package Oops.DataHiding;

class AnimalTest{
    private String animalName;
    private int animalAge;

    public String getAnimalName() {

        return animalName;
    }

    public void setAnimalName(String animalName) {

        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }


}
 public class Animal {
    public static void main(String[] args) {
        AnimalTest animalTest= new AnimalTest();
        animalTest.setAnimalName("Dog");
        animalTest.setAnimalAge(7);
        System.out.println(animalTest.getAnimalAge());
        System.out.println(animalTest.getAnimalName());


    }

}
