package com.connectors.main_application.Controller;

public class RemovingDuplicates {
    public static void main(String[] args) {
        test("121212***");
    }

    public static Integer test(String input){
        int result = 0;

        for (char c : input.toCharArray()) {
            result = result * 10 + (c - '0');
        }

        System.out.println("Converted integer: " + result);
        return result;
    }

}
