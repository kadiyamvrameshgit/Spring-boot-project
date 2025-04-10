//package com.connectors.main_application.Controller;
//
//import java.util.Stack;
//
//public class StringValidParanthesis {
//
//    public static boolean isValid(String s) {
//
//        Stack<Character> stack = new Stack();
//
//        for (char c : s.toCharArray()) {
//            if (c == '(' || c == '[' || c == '{') {
//                stack.push(c);
//
//            } else {
//                if (stack.isEmpty())
//                    return false;
//
//                char top = stack.pop();
//                if (c == ')' && top != '(') ;
//                if (c == ']' && top != '[') ;
//                if (c == '}' && top != '{') ;
//
//
//            }
//
//
//            return false;
//        }
//
//    }
//}