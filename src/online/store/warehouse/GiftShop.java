package online.store.warehouse;

public class GiftShop {

    public static void main(String[] arguments)
    {
        StoreFront store = new StoreFront();
        store.addItem("CO1", "klawiatura","500","100","true");
        store.addItem("CO2", "myszka","300","500","false");
        store.addItem("CO3", "podkładka","50","700", "false");
        store.addItem("CO4", "monitor","2500","50", "true");

        store.sort();

        for(int i = 0; i < store.getSize(); i++)
        {
            Item show = (Item) store.getItem(i);

            System.out.println("\nIdentyfikator elementu: " + show.getId() +
                    "\nNazwa: " + show.getName() +
                    "\nCena detaliczna: " + show.getRetail() +
                    "\nCena: " + show.getPrice() +
                    "\nSztuk: " + show.getQuantity());
        }

    }
}
