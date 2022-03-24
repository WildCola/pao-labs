package com.company;

public class MyServiceEager
{

    private static MyServiceEager instance = new MyServiceEager();

    private MyServiceEager()
    {

    }

    static MyServiceEager getInstance()
    {
        return instance;
    }
}
