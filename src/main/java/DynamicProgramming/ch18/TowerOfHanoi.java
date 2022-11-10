package DynamicProgramming.ch18;

public class TowerOfHanoi {
    private static void solveTower(int disks,int source, int des, int temp){
        if (disks==1){
            System.out.printf("\n%d --> %d",source,des);
            return;
        }
        solveTower(disks-1,source,temp,des);
        System.out.printf("\n%d --> %d",source,des);
        solveTower(disks-1,temp,des,source);
    }

    public static void main(String[] args) {
        int startPeg=1;
        int endPeg=3;
        int tempPeg=2;
        int totalDisks=2;
        solveTower(totalDisks,startPeg,endPeg,tempPeg);
    }
}
