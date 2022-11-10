package parctice;

public class Indoor extends Sports{
    public Indoor(int players,String material,String source){
        super(players, material, source);
    }
    public void playing(){
        System.out.println("Playing games in a home");
    }
}
