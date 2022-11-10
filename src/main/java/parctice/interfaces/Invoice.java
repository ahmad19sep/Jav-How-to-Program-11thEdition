package parctice.interfaces;

import ch6methods.MathFunction;

public class Invoice implements Payable {
    private int totalItems;
    private final int  amountPerItem;

    public Invoice(int totalItems, int amountPerItem) {
        this.totalItems = totalItems;
        this.amountPerItem = amountPerItem;
    }
    public void setTotalItems(int totalItems){
        this.totalItems=totalItems;
    }
    public int getTotalItems(){
        return this.totalItems;
    }
    public int getAmountPerItem(){
        return this.amountPerItem;
    }

    @Override
    public String getAmount() {
      return  String.format("%d",this.totalItems*this.amountPerItem);
    }


}
