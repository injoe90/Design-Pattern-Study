package Observer;

public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽥꽥학자: " + duck + "가/이 방금 소리냈다.");
    }
}
