package online.store.warehouse;

public class Item implements Comparable{
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;

    Item(String id, String name, String retail, String quantity)
    {
        this.id = id;
        this.name = name;
        this.retail = Double.parseDouble(retail);
        this.quantity = Integer.parseInt(quantity);

        if(this.quantity > 400)
        {
            price = this.retail* .5D;
        }
        else if (this.quantity > 200)
        {
            price = this.retail * .6D;
        }
        else
        {
            price = this.retail * .7D;
        }

        price = Math.floor(price * 100 + .5) / 100;

    }


    public int compareTo(Object obj)
    {
        Item temp = (Item) obj;
        if (this.price < temp.price)
        {
            return 1;
        }
        else if (this.price > temp.price)
        {
            return -1;
        }

        return 0;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getRetail()
    {
        return retail;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }



}
