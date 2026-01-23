import types.industrial;
// import Robots.ypes.industrial;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Robot Factory!");
        industrial robot1 = new industrial();
        robot1.chassy();
        robot1.powerSource();
        robot1.sensors();
        robot1.Software_language();
        robot1.pick_object();
        robot1.scan_environment();
    }
}
