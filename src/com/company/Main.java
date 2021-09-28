package com.company;

import Stringrebuilder.Compress;
import Stringrebuilder.Invert;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sting here\n");
        String str1 = scanner.nextLine();
        StringRedact str = new StringRedact(str1);
        System.out.println(str.toString());
    }
}
