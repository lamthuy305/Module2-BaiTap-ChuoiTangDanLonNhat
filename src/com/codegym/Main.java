package com.codegym;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> maxGlobal = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> text = new LinkedList<>();
            text.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > text.getLast()) {
                    text.add(string.charAt(j));
                } else {               // thêm dòng này so với bài trước
                    break;              // thêm dòng này so với bài trước
                }                       // thêm dòng này so với bài trước
            }

            if (maxGlobal.size() < text.size()) {
                maxGlobal.clear();
                maxGlobal.addAll(text);
            }

        }


        for (Character ch : maxGlobal) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
