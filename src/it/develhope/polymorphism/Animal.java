package it.develhope.polymorphism;

public class Animal {
    private String animalName;
    public Animal(String animalName){
        this.animalName = animalName;
    }

    public String animalSound(){
        return "Roarr!";
    }

    public String animalSound(String intensity){
        if(intensity.equals("High"))return "Roarrrrrrrr!";
        if(intensity.equals("Low"))return "Roar";
        else return "Cannot reproduce it properly";
        }
}
