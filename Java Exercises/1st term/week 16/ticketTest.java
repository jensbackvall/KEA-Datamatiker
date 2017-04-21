import java.util.*;
import java.io.*;

public class ticketTest {
    public static void main(String[] args) {
        WalkupTicket wt1 = new WalkupTicket(1);
        wt1.printTicket();

        WalkupTicket wt2 = new WalkupTicket(45);
        wt2.printTicket();

        AdvanceTicket at1 = new AdvanceTicket(3, 11);
        at1.printTicket();

        AdvanceTicket at2 = new AdvanceTicket(5, 2);
        at2.printTicket();

        StudentAdvanceTicket sat1 = new StudentAdvanceTicket(4, 11);
        sat1.printTicket();

        StudentAdvanceTicket sat2 = new StudentAdvanceTicket(7, 2);
        sat2.printTicket();
    }
}