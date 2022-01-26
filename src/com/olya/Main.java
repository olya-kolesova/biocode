package com.olya;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the code, please.");
        String code = scanner.next();

        char[] codeChar = code.toCharArray();
        String[] codeStr = new String[codeChar.length];
        ArrayList<String> codeFormat = new ArrayList<>();

        for (int i = 0; i < codeChar.length; i++) {
            codeStr[i] = String.valueOf(codeChar[i]);
        }


        if (codeStr.length == 1) {
            codeFormat.add(codeStr[0]);
            codeFormat.add("1");
        } else {
            int index = 0;
            int counter = 1;
            for (int i = index + 1; i < codeChar.length; i++) {
                if (codeStr[i].equals(codeStr[index])) {
                    counter += 1;
                    if (i == codeChar.length - 1) {
                        codeFormat.add(codeStr[i]);
                        codeFormat.add(String.valueOf(counter));
                    }
                } else {
                    codeFormat.add(codeStr[index]);
                    index = i;
                    codeFormat.add(String.valueOf(counter));
                    counter = 1;
                    if (i == codeChar.length - 1) {
                        codeFormat.add(codeStr[i]);
                        codeFormat.add(String.valueOf(counter));
                    }
                }
            }
        }

        String finalCode = "";
        for (int i = 0; i < codeFormat.size(); i++) {
            finalCode += codeFormat.get(i);
        }

        System.out.println(finalCode);
    }
}
