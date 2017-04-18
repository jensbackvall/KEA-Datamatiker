import java.util.*;
import java.io.*;

public class Ticket {

    private int ticketNumber;

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getNumber(){
        return ticketNumber;
    }

    public double getPrice(){
        return 50.0;
    }

    public String getName(){
        return "CampusEvent 2017";
    }

    public void printTicket(){
        System.out.println("Event: " + getName() + ", Price: " + getPrice() + " $ - Ticket number: " + getNumber());
    }
}
