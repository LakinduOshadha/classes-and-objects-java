package classes_and_objects.invoice;

/**
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class InvoiceTest {
    public static void main(String args[]){
        // Creating the object
        Invoice Invoice1 = new Invoice("001", "description for Invoice1",
                5, 250.0);

        // Testing Getters
        System.out.println("---Testing Getters---");
        System.out.println("Number :" + Invoice1.getNumber());
        System.out.println("Description :" + Invoice1.getDescription());
        System.out.println("Quantity of the item being purchased  :" + Invoice1.getQuantity());
        System.out.println("Price per item :" + Invoice1.getPricePerItem() + "\n");

        // Testing Setters
        System.out.println("---Testing Setters---");
        System.out.println("setting number to : 577 \ndescription to : new description for Invoice1 " +
                "\nQuantity to : 7 \nprice per item to : 658.8  \n");
        Invoice1.setNumber("577");
        Invoice1.setDescription("new description for Invoice1");
        Invoice1.setPricePerItem(658.8);
        Invoice1.setQuantity(7);
        System.out.println("---Checking values After Setting---");
        System.out.println("Number :" + Invoice1.getNumber());
        System.out.println("Description :" + Invoice1.getDescription());
        System.out.println("Quantity of the item being purchased  :" + Invoice1.getQuantity());
        System.out.println("Price per item :" + Invoice1.getPricePerItem() + "\n");

        // Testing getInvoiceAmount method
        System.out.println("---Testing getInvoiceAmount method---");
        System.out.println("New Invoice amount : " + Invoice1.getInvoiceAmount());


    }
}
