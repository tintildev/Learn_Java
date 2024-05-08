package at.mklestil.view;

public class MyView {

    private int cinemaRoom = 0;
    private int people = 0;
    private int seat = 0;
    private int day = 0;
    private Scanner scanner;

    public MyView() {
        
    }

    public int setCinemaRoom (){
        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter cinema room 1 - 3: ");
        cinema = myObj.nextLine();  // Read user input
        scanner.close();
    }

    public int setPeople (){
        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of people: ");
        cinema = myObj.nextLine();  // Read user input
        scanner.close();
    }

    public int setSeat (){
        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter seat type 1 - 2: ");
        cinema = myObj.nextLine();  // Read user input
        scanner.close();
    }

    public int setDay (){
        scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter day 1 - 7: ");
        cinema = myObj.nextLine();  // Read user input
        scanner.close();
    }
}
