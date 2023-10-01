package org.models;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest
{
    @ParameterizedTest
    @MethodSource("generateData")
    public void heapsortTest(int[] input, int[] expected)
    {
        assertArrayEquals(input, expected);
    }

    private static Stream<Arguments> generateData()
    {
        return Stream.of(
                Arguments.arguments(HeapSort.sort(new int[]{3, 1, 2}), new int[]{1, 2, 3}),
                Arguments.arguments(HeapSort.sort(new int[]{}), new int[]{}),
                Arguments.arguments(HeapSort.sort(new int[]{2, 1, 6, 4, 5, 3, 7}), new int[]{1, 2, 3, 4, 5, 6, 7}),
                Arguments.arguments(HeapSort.sort(new int[]{-1, -2, -3}), new int[]{-3, -2, -1})
        );
    }
}