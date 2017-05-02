
public class TestTV {

    public static void main(String[] args) {
        TV lg = new TV();
        lg.setChannel(5);
        lg.channelUp();
        lg.volumeUp();
        lg.setChannel(130);
        lg.setChannel(119);
        lg.turnOff();
        lg.printCurrentState();
    }
}
