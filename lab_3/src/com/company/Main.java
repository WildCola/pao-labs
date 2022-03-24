package com.company;

import com.company.abstracts.ConcreteClass;

public class Main
{
    public static void main(String[] args)
    {
        MyServiceLazy myService2 = MyServiceLazy.getInstance();
        MyServiceEager MyService3;

        ConcreteClass obj = new ConcreteClass("clasa1", "tip1");
        System.out.println(obj.getName());
        System.out.println(obj.getType());
        System.out.println(obj.getAll());
    }
}
