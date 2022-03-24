package com.company.classes;

public class Bird extends Animal
{
    @Override
    public void makeSound()
    {
        //super.makeSound();
        System.out.println("This animal makes the sound: chirp!");
    }

    @Override
    public void move()
    {
        System.out.println("This animal moves by: flying");
    }
}
