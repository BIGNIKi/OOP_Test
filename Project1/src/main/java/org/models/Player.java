package org.models;

import org.interfaces.Moveable;

public final class Player extends Enemy implements Moveable
{
    public Integer a = 1;
    private int _b = 5;

    private String c = "sdfsdf";

    public Player() {
        super(5);
        items.add(100);
    }

    public static int Sum(int a, int b)
    {
        return a + b;
    }

/*    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return _b == player._b && Objects.equals(a, player.a) && Objects.equals(c, player.c);
    }*/

    @Override
    public int hashCode()
    {
        return 5;
    }

    @Override
    public void Move()
    {
        System.out.println();
    }

    @Override
    public int Push(int a)
    {
        return 0;
    }

/*    @Override
    protected void Breath()
    {
        System.out.println("I breath");
    }*/
}
