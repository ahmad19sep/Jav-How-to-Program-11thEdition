public class Main {
    public static void main(String[] args) {
        PetrolPurchase basirPur=new PetrolPurchase("Basirpur","All",1000000,150,10000,"All");
        basirPur.setLocationPump("purani Chongi");
        basirPur.setPetrolType("Desiel,petrol ");
        basirPur.setNamePump("Local");
        basirPur.setDiscount(10000);
        basirPur.setRsPrLtr(150);
        basirPur.setPetrolQuantity(1000);
        System.out.println(basirPur.getNamePump());
        System.out.println(basirPur.getLocationPump());
        System.out.println(basirPur.getPetrolType());
        System.out.println(basirPur.getPetrolQuantity());
        System.out.println(basirPur.getRsPrLtr());
        System.out.println(basirPur.getDiscount());
        System.out.println("Total Amount you pay = "+basirPur.getPurchaseAmount());

    }
}
