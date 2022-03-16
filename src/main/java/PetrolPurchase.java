public class PetrolPurchase {
    private String locationPump;
    private String petrolType;
    private int petrolQuantity;
    private double rsPrLtr;
    private double discount;
    private String namePump;

    public PetrolPurchase(String locationPump, String petrolType, int petrolQuantity, double rsPrLtr, double discount, String namePump) {
        this.petrolQuantity = petrolQuantity;
        this.discount = discount;
        this.petrolType = petrolType;
        this.locationPump = locationPump;
        this.rsPrLtr = rsPrLtr;
        this.namePump = namePump;
    }

    public void setLocationPump(String locationPump) {
        this.locationPump = locationPump;
    }

    public void setNamePump(String namePump) {
        this.namePump = namePump;
    }

    public String getNamePump() {
        return this.namePump;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }

    public void setRsPrLtr(double rsPrLtr) {
        this.rsPrLtr = rsPrLtr;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getLocationPump() {
        return this.locationPump;
    }

    public String getPetrolType() {
        return this.petrolType;
    }

    public int getPetrolQuantity() {
        return this.petrolQuantity;
    }

    public double getRsPrLtr() {
        return this.rsPrLtr;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getPurchaseAmount() {
        return petrolQuantity * rsPrLtr - discount;
    }

}