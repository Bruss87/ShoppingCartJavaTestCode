import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    ShoppingCart shoppingCart;
    Item item1;
    Item item2;
    Item item3;


    @Before
    public void before(){
        shoppingCart = new ShoppingCart();
        item1 = new Item("Mangetout", 10.00, 2, ItemType.FROZEN);
        item2 = new Item("Red grapefruit", 6.50, 4, ItemType.FRUIT);
        item3 = new Item("Mooli", 5.09,2, ItemType.VEGETABLE);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);
    }

    @Test
    public void canCountItems(){
        assertEquals(3, shoppingCart.itemCount());
    }

    @Test
    public void canRemoveItem(){
        shoppingCart.removeItem(item1);
        assertEquals(2, shoppingCart.itemCount());
    }

    @Test
    public void destroy(){
        shoppingCart.removeAll();
        assertEquals(0, shoppingCart.itemCount() );
    }

    @Test
    public void canCalculateTotal(){
        assertEquals(49.550, shoppingCart.getTotal(), 0.01);
    }


}
