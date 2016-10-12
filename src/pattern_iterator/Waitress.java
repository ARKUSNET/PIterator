package pattern_iterator;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by a.kuspakov on 11.10.2016.
 */
public class Waitress {
    ArrayList menus;
    String[] eatTime = {"\nBREAKFAST", "\nLUNCH", "\nDINNER"};
    int eatFlag = 0;

    public Waitress(ArrayList menus){
        this.menus = menus;
    }

    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        System.out.println("MENU");
        while (menuIterator.hasNext())
        {
            if(eatFlag < 4) System.out.println(eatTime[eatFlag]);
            eatFlag++;
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
