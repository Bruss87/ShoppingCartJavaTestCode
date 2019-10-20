import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TenPercentOffDiscountTest {
    TenPercentOffDiscount tenPercentOffDiscount;

    @Before
    public void before(){
        tenPercentOffDiscount = new TenPercentOffDiscount(21.59);
    }

    @Test
    public void canApplyDiscount(){
        assertEquals(19.431, tenPercentOffDiscount.apply());
    }

}
