public class Item {

        private String name;
        private double price;
        private int quantity;
        private ItemType itemType;

        public Item(String name, double price, int quantity, ItemType itemType ){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.itemType = itemType;
        }

        public String getName(){
            return name;
        }

        public double getPrice(){
            return price;
        }

        public void setPrice(double newPrice){
            price = newPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public ItemType getItemType(){
            return itemType;
        }
    }

