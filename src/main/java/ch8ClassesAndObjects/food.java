package ch8ClassesAndObjects;


public enum food {
    BANANA("FRUIT", "78"),
    APPLE("FRUIT", "23"),
    CARROT("VEGITABLE", "12");
    private final String type;
    private final String calories;

    food(String type, String calories) {
        this.calories = (calories);
        this.type=type;
    }

    public String getCalories() {
        return calories;
    }
    public String getType(){
        return type;
    }
}
