package LambdasandStreamsch17.ch17Exerisce;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private float price;

    public Invoice(String partNumber, String partDescription,
                   int quantity, float price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
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

    public float getPrice() {
        return price;
    }
    public String toString(){
        return String.format("%-8s\t%8s\t%3d\t\t%-4.2f%n",
                partNumber,partDescription,quantity,price);
    }
}
