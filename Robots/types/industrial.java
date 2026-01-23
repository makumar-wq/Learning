package types;
import base.Robot;
import interfaces.movable;
import interfaces.social;
import interfaces.workable;
public class industrial extends Robot implements workable,movable,social{
    // public industrial(String name){
    //     super(name);
    // }
    @Override
    public void chassy() {
        System.out.println("Industrial Robot has a heavy-duty chassy");
    }
    @Override
    public void powerSource() {
        System.out.println("Industrial Robot is powered by electricity");
    }
    @Override
    public void sensors() {
        System.out.println("Industrial Robot has proximity and vision sensors");
    }
    @Override
    public void Software_language() {
        System.out.println("Industrial Robot uses Java as its programming language");
    }
    @Override
    public void pick_object() {
        System.out.println("Industrial Robot can pick objects");
    }
    @Override
    public void scan_environment() {
        System.out.println("Industrial Robot can scan the environment");
    }
    @Override
    public void move() {
        System.out.println("Industrial Robot can move");
    }
    @Override
    public void turn() {
        System.out.println("Industrial Robot can turn");
    }
    @Override
    public void stop() {
        System.out.println("Industrial Robot can stop");
    }
    @Override
    public void communicate() {
        System.out.println("Industrial Robot can communicate");
    }
    @Override
    public void shake_hands() {
        System.out.println("Industrial Robot can shake hands");
    }
}
