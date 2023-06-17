import Beverage.DarkRoast;
import Beverage.Espresso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDecorator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add(new Espresso());

        /* 배열에 들어가는 요소의 데이터 유형을 지정 */
        List espresso = Collections.checkedList(list, Espresso.class);

        /* 배열을 바꿀 수 없도록 변경 */
        List unmodifiableList = Collections.unmodifiableList(list);

        list.add(new DarkRoast());

        /* Error 발생 */
        espresso.add(new DarkRoast());
        unmodifiableList.add(new Espresso());

    }
}
