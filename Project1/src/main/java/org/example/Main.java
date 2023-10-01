package org.example;

import org.models.Entity;
import org.models.Player;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        var list = new ArrayList<Integer>();

        var player = new Player();
        for (var p:
             player)
        {
            System.out.println(p);
        }
    }

    private static void DoSth(Entity sthWhoCanMove)
    {
        sthWhoCanMove.DoSth();
    }

    private static void IterateAll(Iterable a)
    {
        for (var b :
             a)
        {
            System.out.println(b);
        }
    }
}