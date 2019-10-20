import java.util.ArrayList;

public class ShoppingCart {

    public LoyaltyCardDiscount loyaltyCardDiscount;
    public TenPercentOffDiscount tenPercentOffDiscount;
    private ArrayList <Item> items;


        public ShoppingCart() {
            this.items = new ArrayList<Item>();
        }

        public int itemCount() {
            return items.size();
        }

        public void addItem(Item item) {
            items.add(item);
        }

        public void removeItem(Item item){
            items.remove(item);
        }

        public void removeAll() {
            items.clear();
        }

        public double getTotal() {
            tenPercentOffDiscount.apply();
            loyaltyCardDiscount.apply();
            double totalPrice = 0;
            for (Item item : this.items) {
               totalPrice += item.getPrice() * item.getQuantity();
            }
            return totalPrice;
        }



    }

