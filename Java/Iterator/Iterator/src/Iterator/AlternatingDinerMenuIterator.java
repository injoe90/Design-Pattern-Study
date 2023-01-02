package Iterator;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items, int position) {
        this.items = items;
        this.position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.length && this.items[this.position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.items[this.position];
        this.position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove()는 지원하지 않습니다.");
    }
}
