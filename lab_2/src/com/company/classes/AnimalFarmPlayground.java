package com.company.classes;

public class AnimalFarmPlayground
{

    public static void main(String[] args)
    {
        Animal myAnimal = new Animal(2);
        System.out.println(myAnimal);
        System.out.println(myAnimal.getAge());

        Animal myAnimal2 = new Animal(5, "Alex Velea");
        System.out.println(myAnimal2.getAge());
        System.out.println(myAnimal2.getName());

        Bird bird1 = new Bird();
        bird1.makeSound();
        bird1.move();

        Cat cat1 = new Cat(CatBreed.BRITISH_SHORT_HAIR, 3, "cat1");
        System.out.println(cat1.getBreed());
        System.out.println(cat1.getName());
    }

}
