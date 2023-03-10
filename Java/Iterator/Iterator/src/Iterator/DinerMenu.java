package Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        this.addItem("채식주의자용 BLT"
                , "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
        this.addItem("BLT"
                , "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
        this.addItem("오늘의 수프"
                , "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
        this.addItem("핫도그"
                , "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (this.numberOfItems >= MAX_ITEMS) { System.err.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다."); }
        else { this.menuItems[this.numberOfItems++] = new MenuItem(name, description, vegetarian, price); }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}
