package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    @Test
    void ShouldCalculateSqrtCeil() {
        MathService service = new MathService();
        int expected = 4;
        int actual = service.calculateSqrtCeil(16);

        assertEquals(expected, actual);
    }
}