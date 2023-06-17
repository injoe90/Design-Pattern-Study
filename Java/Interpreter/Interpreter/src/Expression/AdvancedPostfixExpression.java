package Expression;

import java.util.Map;

public interface AdvancedPostfixExpression {
    int interpret(Map<Character, Integer> context);

    static AdvancedPostfixExpression plus(AdvancedPostfixExpression left
                                        , AdvancedPostfixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static AdvancedPostfixExpression minus(AdvancedPostfixExpression left
            , AdvancedPostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static AdvancedPostfixExpression variable(Character c) {
        return context -> context.get(c);
    }
}
