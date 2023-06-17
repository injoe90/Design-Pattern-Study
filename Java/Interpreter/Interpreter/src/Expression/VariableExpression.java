package Expression;

import java.util.Map;

public class VariableExpression implements PostfixExpression{
    private Character variable;

    public VariableExpression(Character character) {
        this.variable = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(variable);
    }
}
