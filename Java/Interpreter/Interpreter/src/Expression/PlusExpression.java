package Expression;

import java.util.Map;

public class PlusExpression implements PostfixExpression{
    private PostfixExpression right, left;

    public PlusExpression(PostfixExpression right, PostfixExpression left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
