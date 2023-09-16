package org.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void GenerateNumberTest()
    {
        Assertions.assertEquals(Player.Sum(1, 3),  4);
    }
}
