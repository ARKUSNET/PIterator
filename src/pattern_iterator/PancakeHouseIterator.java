package pattern_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by a.kuspakov on 11.10.2016.
 */
public class PancakeHouseIterator implements Iterator {
    int position = 0;
    ArrayList menuItems;

    public PancakeHouseIterator(ArrayList menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
