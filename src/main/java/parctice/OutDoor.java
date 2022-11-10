package parctice;

public class OutDoor extends Sports {
    private String ground;

    public OutDoor(int players, String material, String source, String ground) {
        super(players, material, source);
        this.ground = ground;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }
    public void playing(){
        System.out.println("Cricket Playing");
    }
   /* public String toString(){
        return super.toString()+ground;
    }*/

    @Override
    public String toString() {
        return "OutDoor{" +
                "ground='" + ground + '\'' +
                "} " + super.toString();
    }
}
