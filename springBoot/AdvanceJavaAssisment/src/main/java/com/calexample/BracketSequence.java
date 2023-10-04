package com.calexample;
import java.util.Scanner;
import java.util.Stack;

public class BracketSequence {
    public static String checkBracketSequence(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (char c : sequence.toCharArray()) {
            if (c == '(' || c == '[' || c == '{' || c == '<') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}' || c == '>') {
                if (stack.isEmpty() || !isMatchingBracket(stack.peek(), c)) {
                    return "0";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "1" : "0";
    }

    public static boolean isMatchingBracket(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}') ||
                (opening == '<' && closing == '>');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numTestCases; i++) {
            String sequence = scanner.nextLine();
            String result = checkBracketSequence(sequence);
            System.out.print(result + " ");
        }
    }
}