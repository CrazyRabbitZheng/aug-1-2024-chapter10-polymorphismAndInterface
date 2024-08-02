/**
 * This class implements Payable
 * @author--Zheng Wang
 */
public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if(pricePerItem < 0){
            throw new IllegalArgumentException("Price per item cannot be negative");
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s%n%s %d%n%s $%.2f", "invoice", "part number",
                getPartNumber(), getPartDescription(), getQuantity(),
                "price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem();
    }
}
