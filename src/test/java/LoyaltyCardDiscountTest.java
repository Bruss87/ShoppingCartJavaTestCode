import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LoyaltyCardDiscountTest {
    LoyaltyCardDiscount loyaltyCardDiscount;

    @Before
    public void before(){
        loyaltyCardDiscount = new LoyaltyCardDiscount(true, 19.431);
    }

    @Test
    public void hasLoyaltyCardDiscount(){
        assertEquals(19.042, loyaltyCardDiscount.apply(),0.01);
    }
}
