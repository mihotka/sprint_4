package com.yandex;

public class Praktikum {

    public static void main(String[] args) {
    }

    String cardName;

    Account account = new Account(cardName);

    public boolean printOnCardAccess(String cardName) {
        return account.checkNameToEmboss(cardName);
    }
}


