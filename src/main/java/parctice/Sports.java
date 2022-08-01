package parctice;

public class Sports {
    private int players;
    private String material;
    private  String source;
    public Sports(int players,String material,String source){
        this.material=material;
        this.players=players;
        this.source=source;
    }

    public int getPlayers() {
        return players;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public void setSource(String source) {
        this.source = source;
    }
    public String getSource(String source){
        return this.source;
    }
    public String toString(){
        return String.format("%s : %d%n%s : %s%n%s : %s","Player",players,
                "RequiredThings for Game ",material,"Source",source);


    }
}
