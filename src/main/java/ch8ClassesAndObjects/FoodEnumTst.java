package ch8ClassesAndObjects;

public class FoodEnumTst {
    public static void main(String[] args) {
        for (food i :food.values() ){
            System.out.printf("%-10s%-10s%-10s%n",i,i.getType(),i.getCalories());
        }
    }
}
