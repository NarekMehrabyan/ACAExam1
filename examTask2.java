package com.aca;

import java.util.Scanner;

public class examTask2 {

    public static void main(String[] args) {

        System.out.println(palindrome());

    }

    static boolean palindrome() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String revStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            revStr = ch + revStr;
        }
            if (revStr.equals(str)) {
                return true;
            } else {
                return false;
            }
    }
    }
