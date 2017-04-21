import java.util.*;
import java.io.*;

public class StudentAdvanceTicket extends AdvanceTicket {

    public StudentAdvanceTicket(int ticketNumber, int days) {
        super(ticketNumber, days);
    }

    public double getPrice() {
        return super.getPrice() / 2;
    }

    public void printTicket(){
        System.out.println("Event: " + getName() + ", Price: $" + getPrice() + ", Ticket number: " + getNumber() + " (ID required)");
    }
}