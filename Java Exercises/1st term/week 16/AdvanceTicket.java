import java.util.*;
import java.io.*;

public class AdvanceTicket extends Ticket {

    public int adv_days;

    public AdvanceTicket(int ticketNumber, int days) {
        super(ticketNumber);
        adv_days = days;
    }

    public double getPrice() {
        if (adv_days < 10) {
            return super.getPrice() - 10.0;
        } else {
            return super.getPrice() - 20.0;
        }
    }
}