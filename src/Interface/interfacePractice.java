package Interface;


public class interfacePractice {
    public static void main(String[] args) {
        Remote remote = new Television();
        remote.powerOn();
        remote.volumeUp();
        remote.volumeDown();
        remote.powerOff();
    }
}
interface Remote{
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
class Television implements Remote{
    @Override
    public void powerOn() {
        System.out.println("Powered On");
    }
    @Override
    public void powerOff() {
        System.out.println("Powered Off");
    }
    @Override
    public void volumeUp() {
        System.out.println("Increase Volume");
    }
    @Override
    public void volumeDown() {
        System.out.println("Decrease volume");
    }
}
