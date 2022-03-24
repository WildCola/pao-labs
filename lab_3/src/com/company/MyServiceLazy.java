package com.company;

public class MyServiceLazy
{

    private static MyServiceLazy instance;

    private MyServiceLazy(){}

    static MyServiceLazy getInstance()
    {
        if(instance == null)
        {
            instance = new MyServiceLazy();
        }
        return instance;
    }

}
