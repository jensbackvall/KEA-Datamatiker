
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        on = true;
        if (newChannel > 0 && newChannel < 121) {
            channel = newChannel;
        } else {
            System.out.println("Kanalen skal være fra 1 t.o.m. 120");
            printCurrentState();
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on == true) {
            if (newVolumeLevel < 8) {
                volumeLevel = newVolumeLevel;
            } else {
                volumeLevel = 7;
            }
        }
    }

    public void channelUp() {
        if (on == false) {
            on = true;
            channel = 1;
        } else {
            if (channel < 120) {
                channel++;
            } else {
                channel = 1;
            }
        }
    }

    public void channelDown() {
        if (on == false) {
            on = true;
            channel = 120;
        } else {
            channel--;
        }
    }

    public void volumeUp() {
        if (on == true && volumeLevel < 7) {
                volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on == true && volumeLevel > 0) {
                volumeLevel--;
        }
    }

    public void printCurrentState() {
        if (on == true) {
            System.out.println("Kanalen er: " + channel);
            System.out.println("Volumeniveauen er: " + volumeLevel);
        } else {
            System.out.println("Fjernsynet er slukket, tænd det først for at bruge det!");
        }

    }
}