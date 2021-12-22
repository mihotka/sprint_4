package com.yendex;

import com.yandex.Praktikum;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class PraktikumExeptionTest {
    Praktikum praktikum = new Praktikum();

    @Test(expected = Exception.class)
    @DisplayName("Проверка ввода пустого поля")
    public void nullTest() {
        praktikum.printOnCardAccess(null);
    }
}
