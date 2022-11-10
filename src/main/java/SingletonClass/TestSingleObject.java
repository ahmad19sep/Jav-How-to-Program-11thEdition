package SingletonClass;

public class TestSingleObject {
    int a=3;
    int b=4;
    String name="muneeba";

    public static void main(String[] args) {
        SingleObject obj1=SingleObject.getConnection("connected");
        obj1.closeConnection();
        SingleObject obj2=SingleObject.getConnection("notConnected");

        System.out.println(obj2.getNetwork());
    }
}
/////////////////////////////
