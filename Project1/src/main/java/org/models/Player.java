package org.models;

import java.util.Objects;

public class Player {
    public Integer a = 1;
    private int _b = 5;

    private String c = "sdfsdf";

    public Player() {

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
}
