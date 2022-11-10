package ch10OOP;

public class Mobile<size> extends generalTech implements Tv {

   private int cameraResolution;
public static String  size="lp";
    public Mobile(String name, String company, int cameraResolution) {
        super(name, company);
        this.cameraResolution = cameraResolution;
    }
    public void setCameraResolution(){
        this.cameraResolution=cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }
    @Override
    public String size(){
        return "10*4";
    }
    public String screen(){
       return  "10*4";
    }
}
