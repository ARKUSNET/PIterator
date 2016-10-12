package pattern_iterator;

import java.util.ArrayList;

/**
 * Created by a.kuspakov on 11.10.2016.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(0, pancakeHouseMenu);
        menus.add(1, dinerMenu);
        menus.add(2, cafeMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
