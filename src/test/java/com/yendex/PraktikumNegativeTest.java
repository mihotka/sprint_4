package com.yendex;

import com.yandex.Praktikum;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class PraktikumNegativeTest {
    private final String name;

    public PraktikumNegativeTest(String name) {
        this.name = name;
    }
    Praktikum praktikum = new Praktikum();
    @Parameterized.Parameters
    public static Object[][] PraktikumNegativeTestData() {
        return new Object[][]{
                 {" Вася-Шахтер"},
                 {"Вася-Шахтер "},
                 {"Ха"},
                 {"Ва Ся Шахтер"},
                 {"Вячеслав Тимшенкович"},
        };
    }

    @Test
    @DisplayName("Негативные сценарии проверки рабоспособности валидатора имени для банковской карты")
    public void printOnCardAccessTest() {
        boolean actual = praktikum.printOnCardAccess(name);
        assertFalse(actual);
    }
}

