import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ItemTest {
    Item item1;
    Item item2;

    @Before
    public void before(){
        item1 = new Item("Chinese leaf", 1.25, 1, ItemType.BREAD );
        item2 = new Item("Shitake mushrooms", 1.35, 3, ItemType.DRINKS) ;
    }

    @Test
    public void hasName(){
        assertEquals("Shitake mushrooms", item2.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(1.25, item1.getPrice(), 0.01);
    }

    @Test
    public void canChangePrice(){
        item2.setPrice(0.75);
        assertEquals(0.75, item2.getPrice(), 0.01);
    }

    @Test
    public void hasQuantity(){
        assertEquals(3, item2.getQuantity());

    }

    @Test
    public void hasType(){
        assertEquals(ItemType.BREAD, item1.getItemType());
    }

}
