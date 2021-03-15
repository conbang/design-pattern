package bai1;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("meo");
        System.out.println("a1 sound: "+a1.makeSound());
        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 sound:" + a2.makeSound());
    }
}
