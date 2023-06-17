package Parser;

import Expression.*;

import java.util.Stack;

import static Expression.AdvancedPostfixExpression.*;

public class AdvancedPostfixParser {
    public static AdvancedPostfixExpression parse(String expression) {
        Stack<AdvancedPostfixExpression> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }

        return stack.pop();
    }

    private static AdvancedPostfixExpression getExpression(char c, Stack<AdvancedPostfixExpression> stack) {
        switch (c) {
            case '+' -> {
                return plus(stack.pop(), stack.pop());
            }
            case '-' -> {
                AdvancedPostfixExpression right = stack.pop();
                AdvancedPostfixExpression left = stack.pop();
                return minus(left, right);
            }
            default -> {
                return variable(c);
            }
        }
    }
}
