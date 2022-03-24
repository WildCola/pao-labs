package com.company.classes;

public class Cat extends Animal
{
    private CatBreed breed;

    public Cat(CatBreed breed, int age, String name)
    {
        super(age, name);
        this.breed = breed;
    }

    public CatBreed getBreed()
    {
        return breed;
    }

    public void setBreed(CatBreed breed)
    {
        this.breed = breed;
    }

    @Override
    public void makeSound()
    {
        //super.makeSound();
        System.out.println("This animal makes the sound: meow!");
    }

    @Override
    public void move()
    {
        System.out.println("This animal moves by: walking");
    }
}
