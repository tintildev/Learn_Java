package at.mklestil.view;

import java.util.Scanner;

public class MyView {

    private int cinemaRoom = 0;
    private int people = 0;
    private int seat = 0;
    private int day = 0;
    private Scanner scanner;

    public MyView() {
        setCinemaRoom();
        setPeople();
        setSeat();
        setDay();

        scanner.close();
        
    }

    public void setCinemaRoom (){
        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter cinema room 1 - 3: ");
        cinemaRoom = scanner.nextInt();  // Read user input

    }

    public void setPeople (){
        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of people: ");
        people = scanner.nextInt();  // Read user input

    }

    public void setSeat (){
        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter seat type 1 - 2: ");
        seat = scanner.nextInt();  // Read user input

    }

    public void setDay (){
        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter day 1 - 7: ");
        day = scanner.nextInt();  // Read user input

    }

    public int getCinemaRoom() {
        return cinemaRoom;
    }

    public int getPeople() {
        return people;
    }

    public int getSeat() {
        return seat;
    }

    public int getDay() {
        return day;
    }

    public void setPrice(double price) {
        System.out.println("Total price: " + price);
    }
}
