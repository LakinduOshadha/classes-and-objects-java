package classes_and_objects.invoice;

/**This is th invoice class
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class Invoice {
    // Initializing Instance variables as private
    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;

    /**
     * This is the constructor for Invoice
     * @param number number
     * @param description description
     * @param quantity Quantity of the item being purchased
     * @param pricePerItem Price per item
     */
    public Invoice(String number, String description, int quantity, double pricePerItem) {
        setNumber(number);
        setDescription(description);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    /**
     * Getter for number
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Getter for description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter for quantity
     * @return Quantity of the item being purchased
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Getter for pricePerItem
     * @return Price per item
     */
    public double getPricePerItem() {
        return pricePerItem;
    }

    /**
     * Setter for number
     * @param number number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Setter for description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Setter for quantity
     * @param quantity Quantity of the item being purchased
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Setter for pricePerItem
     * @param pricePerItem Price per item
     */
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    /**
     * This returns invoice amount by multiplying the quantity by the price per item
     * @return InvoiceAmount
     */
    public double getInvoiceAmount(){
        // Constraints
        if(this.quantity < 0) this.quantity = 0;
        if(this.pricePerItem < 0) this.pricePerItem = 0.0;

        return this.quantity*this.pricePerItem;
    }
}
