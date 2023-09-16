package org.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnemyTest
{

    public void SumTest1()
    {
        var a = Enemy.Sum(5, 3, 1);
        Assertions.assertEquals(a, 9);
    }


    public void SumTest2()
    {
        var a = Enemy.Sum(1, 9, 1);
        Assertions.assertEquals(a, 11);
    }
}
