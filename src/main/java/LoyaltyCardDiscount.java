
public class LoyaltyCardDiscount implements IDiscount {

    private boolean hasLoyaltyCard;
    private double totalPrice;

    public LoyaltyCardDiscount(boolean hasLoyaltyCard, double totalPrice){
        this.hasLoyaltyCard = false;
        this.totalPrice = totalPrice;
    }

    public double apply() {
        if (hasLoyaltyCard = true){
            return totalPrice = totalPrice - (totalPrice * 0.02);
        }
        return totalPrice;

    }
}
