
public class TenPercentOffDiscount implements IDiscount {

    private double totalPrice;

    public TenPercentOffDiscount(double totalPrice){
        this.totalPrice = totalPrice;
    }

    public double apply() {
        if (totalPrice > 20) {
            return totalPrice = totalPrice - (totalPrice * 0.1);
        }
        return totalPrice;
    }
}
