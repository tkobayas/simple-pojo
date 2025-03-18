package org.example;

import org.springframework.util.StringUtils;

public class Tmp {

    public static void main(String[] args) {

        String s = "tes t";
        boolean b = StringUtils.containsWhitespace(s);
        System.out.println(b);
    }
}
