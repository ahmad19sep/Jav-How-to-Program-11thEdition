package parctice;

public class TestInheritance {
    public static void main(String[] args) {
        OutDoor game1=new OutDoor(11,"bat ball","ground","cricket Stadium");
        game1.playing();
        SitGame game2=new SitGame(44,"dffd","dfdf");
        game2.playing();
        Sports games=new VideoGames(44,"333f","sdfd");
        Sports e=new Indoor(43,"4ff","3fd");
        games.playing();
        e.playing();
    }
}
