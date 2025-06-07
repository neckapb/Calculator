package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest
{

    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("=Старт=");
    }

    @BeforeEach
    public void beforeEach()
    {
        System.out.println();
        System.out.println("результат теста:");
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println();
        System.out.println("=Финиш=");
    }

    @AfterEach
    public void afterEach()
    {
        System.out.println("**********");
    }

    @Test
    @DisplayName("Проверка суммирования")
    @Timeout(10)
    @Tag("plus")
    void summ()
    {
        Calc calculator = new Calc();
        int result = calculator.summ(6, 9);
        Assertions.assertEquals(15, result, "Реальность отличается от ожиданий");
    }

    @Test
    @DisplayName("Проверка вычитания")
    @Timeout(10)
    @Tag("minus")
    void difference()
    {
        Calc calculator = new Calc();
        int result = calculator.difference(12, 3);
        Assertions.assertEquals(9, result, "Реальность отличается от ожиданий");
    }

    @ParameterizedTest
    @CsvSource({"3,4,7", "3, -4, -1", "0,0,0"})
    @DisplayName("Параметризированное суммирование")
    @Timeout(10)
    @Tag("plus")
    void summP(int a, int b, int expectedResult)
    {
        Calc calculator = new Calc();
        int result = calculator.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Реальность отличается от ожиданий");
    }

    @ParameterizedTest
    @CsvSource({"4,3,1", "-4, -3, -1", "0,0,0"})
    @DisplayName("Параметризированное вычитание")
    @Timeout(10)
    @Tag("minus")
    void differenceP(int a, int b, int expectedResult)
    {
        Calc calculator = new Calc();
        int result = calculator.difference(a, b);
        Assertions.assertEquals(expectedResult, result, "Реальность отличается от ожиданий");
    }
}