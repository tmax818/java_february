import java.util.ArrayList;

import javax.crypto.AEADBadTagException;

public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("drip coffee", 1.5);
        Item item2 = new Item("mocha", 2.5);
        Item item3 = new Item("latte", 3.5);
        Item[] items = {item1, item2, item3};
        ArrayList<Item> thelist = new ArrayList<>();
        thelist.add(item1);
        thelist.add(item2);
        thelist.add(item3);
        System.out.println(item1.getName());
        Order order1 = new Order();
        Order order2 = new Order("Jared");
        System.out.println(order1.getName());
        System.out.println(order2.getName());
        order2.addItem(item1);
        order2.addItem(item2);
        order2.addItem(item3);
        System.out.println(order2.getItems().get(0).getName());
        System.out.println(order2.getItems().get(0).getPrice());
        System.out.println(order2.getStatusMessage());
        order1.addItems(items);
        order2.addItems(thelist);

    }
    
}
