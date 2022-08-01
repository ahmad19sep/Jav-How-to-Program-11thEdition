package parctice;

import java.util.Arrays;

public class MainFunction {
    private int num;
    public MainFunction(int num){
        if (num <=100){
            this.num=num;

        }
        else {
            throw new IllegalArgumentException("Numbers out of range");
        }

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num <=100){
        this.num = num;
    }
        throw new IllegalArgumentException("Invalid numbers");
    }
}
