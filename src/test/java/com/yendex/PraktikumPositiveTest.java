package com.yendex;

import com.yandex.Praktikum;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PraktikumPositiveTest {
    private final String name;

    public PraktikumPositiveTest(String name) {
        this.name = name;
    }
    Praktikum praktikum = new Praktikum();
    @Parameterized.Parameters
    public static Object[][] PraktikumPositiveTestData() {
        return new Object[][]{
                {"Вас"},
                {"Вячеслав Тимошенков"},
                {"Вячеслав Тимошенко"},
                {"Вася Шахтер"},
                {"Вася"},
        };
    }

    @Test
    @DisplayName("Позитивные сценарии проверки рабоспособности валидатора имени для банковской карты")
    public void printOnCardAccessTest() {
    boolean actual = praktikum.printOnCardAccess(name);
    assertTrue(actual);
    }
}