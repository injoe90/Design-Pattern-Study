package Quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("<< 조용~ >>");
    }
}
