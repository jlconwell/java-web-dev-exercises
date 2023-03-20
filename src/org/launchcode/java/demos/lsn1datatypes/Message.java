package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {
        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "le poop";
        }else if (lang.equals("de")) {
            return "Tag, Welt!";
        } else {
            return "Hello, World!";
        }
    }
}
