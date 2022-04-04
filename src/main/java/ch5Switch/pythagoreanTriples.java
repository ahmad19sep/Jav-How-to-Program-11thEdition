package ch5Switch;

public class pythagoreanTriples {
    public static void main(String[] args) {
        System.out.printf("%-20s%20s%30s","Side 1","Side 2","Hypotenuse");
        for(int i=1;i<=500; i++){
            for (int j=1;j<=500;j++){
                for(int k=1;k<=500;k++){
                    if((i*i)+(j*j)==(k*k)){
                        System.out.printf("%-20d\t+%14d\t\t\t=%20d%n",i,j,k);{

                        }
                    }
                }
            }
        }
    }
}
