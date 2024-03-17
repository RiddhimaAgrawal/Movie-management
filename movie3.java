package booking;

import java.io.*;
import java.util.Scanner;

public class Ticket {
    private String name;
    private int number;
    private int seattype;
    private int time;
    private int ticketPrice;

    public Ticket(String name, int number, int time, int ticketPrice) {
        this.name = name;
        this.number = number;
        this.time = time;
        this.ticketPrice = ticketPrice;
    }

    public void displayTicket() {
        // Ticket Display logic goes here
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + number);
        System.out.println("Show Time: " + time);
        System.out.println("Seat Type: " + (seattype == 1 ? "Basic" : "Premium"));
        System.out.println("Ticket Price: $" + ticketPrice);
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // Methods for ticket management
    public void increaseTickets(int quantity) {
        number += quantity;
    }

    public void decreaseTickets(int quantity) {
        if (number >= quantity) {
            number -= quantity;
        } else {
            System.out.println("Not enough tickets available.");
        }
    }

    public int getTotalTicketMoney() {
        return number * ticketPrice;
    }

    // Additional methods as needed
}
