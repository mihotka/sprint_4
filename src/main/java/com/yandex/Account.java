package com.yandex;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
    if (name != null) { int whiteSpaceCount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isWhitespace(name.charAt(i))) {
                whiteSpaceCount++;
                if (whiteSpaceCount >= 2) {
                    return false;
                }
            }
        }
    }
    if(Character.isWhitespace(name.charAt(0))){ return false; }
    if(Character.isWhitespace(name.charAt(name.length()-1))){ return false; }
    if (name.length() > 19) { return false; }
    if (name.length() < 3) { return false; }

    return  true;
    }
}
