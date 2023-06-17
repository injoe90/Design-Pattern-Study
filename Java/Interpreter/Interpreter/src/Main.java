import Expression.PostfixExpression;
import Parser.PostfixParser;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }
}