package com.example.javalearn.oj;

import java.util.Arrays;
import java.util.Scanner;

public class Result8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while (in.hasNextLine()) {
            String [] str = in.nextLine().split(" ");
            Arrays.sort(str);
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]+' ');
            }
        }
    }
}
