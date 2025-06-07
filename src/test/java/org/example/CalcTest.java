package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest
{

    @Test
    void summ()
    {
        Calc calculator = new Calc();
        int result = calculator.summ(6, 9);
        Assertions.assertEquals(15, result, "Реальность отличается от ожиданий");
    }

    @Test
    void difference()
    {
        Calc calculator = new Calc();
        int result = calculator.difference(12, 3);
        Assertions.assertEquals(9, result, "Реальность отличается от ожиданий");
    }
}