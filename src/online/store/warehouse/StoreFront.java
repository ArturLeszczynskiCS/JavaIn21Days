package online.store.warehouse;

import java.util.*;

public class StoreFront {

    private LinkedList catalog = new LinkedList();

    public void addItem(String id, String name, String price, String quantity, String noDiscount)
    {
        Item it = new Item(id, name, price, quantity,noDiscount);
        catalog.add(it);
    }

    public Item getItem(int i)
    {
        return (Item) catalog.get(i);
    }

    public int getSize()
    {
        return catalog.size();
    }

    public void sort()
    {
        Collections.sort(catalog);
    }

}
