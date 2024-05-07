package Atividade4_calc;

import java.util.Scanner;
import java.util.Stack;

public class Calc {

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char currentChar = infix.charAt(i);

            if (Character.isDigit(currentChar) || Character.isLetter(currentChar)) {
                postfix.append(currentChar);
            } else if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else if (isOperator(currentChar)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(currentChar)) {
                    postfix.append(stack.pop());
                }
                stack.push(currentChar);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }
    
    public static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = infix.length() - 1; i >= 0; i--) {
            char currentChar = infix.charAt(i);

            if (Character.isDigit(currentChar) || Character.isLetter(currentChar)) {
                prefix.insert(0, currentChar);
            } else if (currentChar == ')') {
                stack.push(currentChar);
            } else if (currentChar == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.insert(0, stack.pop());
                }
                stack.pop(); 
            } else if (isOperator(currentChar)) {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(currentChar)) {
                    prefix.insert(0, stack.pop());
                }
                stack.push(currentChar);
            }
        }

        while (!stack.isEmpty()) {
            prefix.insert(0, stack.pop());
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a expressão infixa:");
        String infix = scanner.nextLine();

        System.out.println("Escolha a notação desejada (posfixa ou prefixa):");
        String notation = scanner.nextLine();

        String result = "";
        if (notation.equals("posfixa")) {
            result = infixToPostfix(infix);
        } else if (notation.equals("prefixa")) {
            result = infixToPrefix(infix);
        } else {
            System.out.println("Notação inválida!");
            scanner.close();
            return;
        }

        System.out.println("Expressão infixa: " + infix);
        System.out.println("Expressão " + notation + ": " + result);

        scanner.close();
    }
}
