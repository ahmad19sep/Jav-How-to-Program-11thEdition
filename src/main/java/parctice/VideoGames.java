package parctice;

public class VideoGames  extends Sports{
    public VideoGames(int players, String material, String source){
        super(players,material,source);
    }
    public void playing(){
        System.out.println("Playing video games");
    }
}
