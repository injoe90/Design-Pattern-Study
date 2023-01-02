package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    int position;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.size() && this.items.get(this.position) != null;
    }

    @Override
    public MenuItem next() {
        return this.items.get(this.position++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안 됩니다!");
    }
}
