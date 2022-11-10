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
    private static SingleObject t;
private static boolean connectionChecker=false;
    public static SingleObject getConnection(String network){
        if (connectionChecker) {
           throw new RuntimeException("network is already connected");

        }
        else {
            t=new SingleObject(network);
            connectionChecker=true;
        }
        return t;
    }
    public static void closeConnection(){
        connectionChecker=false;
    }

}
