package org.interfaces;

public interface Moveable
{
    int coockie = 5;

    void Move();

    default int Push(int a)
    {
        a += 1;
        return a;
    }

}
