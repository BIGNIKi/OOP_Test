package org.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void GenerateNumberTest()
    {
        Assertions.assertEquals(Player.Sum(1, 5),  4);

    }
    @Test
    public void GenerateNumberTest1()
    {

        Assertions.assertEquals(Player.Sum(1, 8),  4);
    }
    @Test
    public void GenerateNumberTest2()
    {

        Assertions.assertEquals(Player.Sum(1, 8),  4);
    }
}
