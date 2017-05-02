
public class TestTV {

    public static void main(String[] args) {
        TV lg = new TV();
    lg.setChannel(5);
    lg.printCurrentState();
    lg.channelUp();
    lg.printCurrentState();
    lg.volumeUp();
    lg.printCurrentState();
    lg.setChannel(130);
    lg.setChannel(119);
    lg.printCurrentState();
    lg.turnOff();
    lg.printCurrentState();
    }
}
