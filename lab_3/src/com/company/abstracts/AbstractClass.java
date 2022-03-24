package com.company.abstracts;

public abstract class AbstractClass
{
    protected String name;
    protected String type;

    public abstract String getName();
    public abstract String getType();

    public String getAll()
    {
        return this.getName() + " " + this.getType();
    }
}
