import java.util.ArrayList;

public class BuyOneGetOneFreeDiscount implements IDiscount {

    private ArrayList<Item> items;

    public double apply() {

        return 0;
//        for (Item item : this.items){
//
//        }
    }
}
//    def apply(self, items):
//        trytytki = filter(lambda e: isinstance(e, Trytytka), items)
//        for i, item in enumerate(trytytki):
//        if i > 0 and i % 2 != 0:
//        item.set_price(1)