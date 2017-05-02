
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {

    }

    public void turnOn() {
        on = true;
        printCurrentState();
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        on = true;
        if (newChannel > 0 && newChannel < 121) {
            channel = newChannel;
            printCurrentState();
        } else {
            System.out.println("Kanalen skal være fra 1 t.o.m. 120");
            printCurrentState();
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on == true) {
            if (newVolumeLevel < 8) {
                volumeLevel = newVolumeLevel;
                printCurrentState();
            } else {
                volumeLevel = 7;
                printCurrentState();
            }
        }
    }

    public void channelUp() {
        if (on == false) {
            on = true;
            channel = 1;
            printCurrentState();
        } else {
            if (channel < 120) {
                channel++;
                printCurrentState();
            } else {
                channel = 1;
                printCurrentState();
            }
        }
    }

    public void channelDown() {
        if (on == false) {
            on = true;
            channel = 120;
            printCurrentState();
        } else {
            channel--;
            printCurrentState();
        }
    }

    public void volumeUp() {
        if (on == true && volumeLevel < 7) {
                volumeLevel++;
                printCurrentState();
        }
    }

    public void volumeDown() {
        if (on == true && volumeLevel > 0) {
                volumeLevel--;
                printCurrentState();
        }
    }

    public void printCurrentState() {
        System.out.println();
        System.out.println("* input er modtaget * ");
        if (on == true) {
            System.out.println("Kanalen er: " + channel);
            System.out.println("Volumeniveauen er: " + volumeLevel);
        } else {
            System.out.println("Fjernsynet er slukket, tænd det først for at bruge det!");
        }

    }
}