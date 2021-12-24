package com.yendex;

import com.yandex.Praktikum;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PraktikumTest {
    private final String name;
    private final boolean expected;

    public PraktikumTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    Praktikum praktikum = new Praktikum();

    @Parameterized.Parameters
    public static Object[][] PraktikumTestData() {
        return new Object[][]{
                {" Вася-Шахтер", false},
                {"Вася-Шахтер ", false},
                {"ВасяШахтер", false},
                {"Ха", false},
                {"Ва Ся Шахтер", false},
                {"Вячеслав Тимшенкович", false},
                {"В С", true},
                {"Вячеслав Тимошенков", true},
                {"Вася Шахтер", true},
                {null, false}
        };
    }

    @Test
    @DisplayName("Проверки рабоспособности валидатора имени для банковской карты")
    public void printOnCardAccessTest() {
        assertEquals(praktikum.printOnCardAccess(name) , expected);
    }
}

