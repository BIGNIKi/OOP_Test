package org.models;

public class Enemy
{
    private static int HelperSum(int a, int b)
    {
        return a + b;
    }

    public static int Sum(int a, int b, int c)
    {
        return HelperSum(a, b) + c;
    }
}
