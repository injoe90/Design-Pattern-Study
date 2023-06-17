import PropertyChange.Subject;
import PropertyChange.User;

public class PropertyChangeExample {
    public static void main(String[] args) {
        Subject subject = new Subject();
        User observer = new User();

        subject.addObserver(observer);
        subject.add("자바 PCL 예제 코드");
        subject.removeObserver(observer);
        subject.add("이 메세지는 볼 수 없지..");
    }
}
