package booking;

import java.io.*;
import java.util.Scanner;

public class Administration {
    private String uid = "admin1";
    private String pwd = "adminpassword";
    private int status = 0;
    int tickets;

    public Administration() {
        tickets = 0;
    }

    public void increaseticket() {
        tickets++;
    }

    public void authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user id:");
        String id = scanner.nextLine();
        System.out.println("Enter password:");
        String pass = scanner.nextLine();

        try {
            if (id.equals(uid) && pass.equals(pwd)) {
                System.out.println("Logged In Successfully");
                admin_menu();
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid credentials");
        }
    }

    static void showstatus() {
        Administration a = new Administration();
        if (a.status == 0) {
            System.out.println("Occupancy not updated!");
        } else {
            System.out.println("Occupancy: " + a.status);
        }
        if (a.tickets == 0) {
            System.out.println("Ticket count not updated!");
        } else {
            System.out.println("Tickets Sold: " + a.tickets);
        }
    }

    static void updatestatus() {
        Scanner scanner = new Scanner(System.in);
        Administration a = new Administration();
        System.out.println("Enter current Occupancy:");
        a.status = scanner.nextInt();
        System.out.println("Enter tickets sold:");
        a.tickets = scanner.nextInt();
    }

    static void addfilm() {
        try {
            FileWriter writer = new FileWriter("movies.txt", true);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter no. of films to add:");
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter movies:");
                String movies = scanner.nextLine();
                writer.write(movies + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void showfilms() {
        try {
            FileReader reader = new FileReader("movies.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void admin_menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add films");
            System.out.println("2. Show films");
            System.out.println("3. Check Status");
            System.out.println("4. Update Status");
            System.out.println("5. Exit");
            System.out.println("Choose:");
            int w = scanner.nextInt();
            switch (w) {
                case 1:
                    addfilm();
                    break;
                case 2:
                    showfilms();
                    break;
                case 3:
                    showstatus();
                    break;
                case 4:
                    updatestatus();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
