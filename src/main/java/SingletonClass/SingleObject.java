package SingletonClass;

public class SingleObject {
    private String network;
    private SingleObject(String network){
        this.network=network;

    }
    public void setNetwork(String network){
        this.network=network;
    }
    public String getNetwork(){
        return network;
    }
    private static SingleObject t=null;

    public static SingleObject getConnection(String network){

        if (t==null){
            t=new SingleObject(network);
        }
        else t.setNetwork(network);
        return t;
    }

}
