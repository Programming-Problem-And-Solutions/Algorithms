package main.java.problem.stack;

// Java program for checking
// balanced Parenthesis

import java.util.LinkedList;
import java.util.Stack;

public class BalanceParam {

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    static boolean areParenthesisBalanced(char exp[]) {
        Stack<Character> paramStack = new Stack<>();
        for (char c : exp) {
            if (isStart(c)) {
                paramStack.push(c);
            } else {
                if (!isMatchingPair(paramStack.pop(), c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static boolean isStart(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static void main(String[] args) {
        char exp[] = {'{', '(', ')', '}', '[', ']'};
        if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

}

