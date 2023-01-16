package it.develhope.polymorphism;

public class Start {
    public static void main(String[] args) {
        Animal animal = new Animal("Mario");

        String soundNoParam = animal.animalSound();
        System.out.println(soundNoParam);

        String soundWithParam = animal.animalSound("High");
        System.out.println(soundWithParam);


    }
}
