package at.mklestil.model;

public class PriceCalculation {

    private int cinemaRoom = 0;
    private int people = 0;
    private int seat = 0;
    private int day = 0;

    private double price = 0;

    public PriceCalculation(int cinemaRoom, int people, int seat, int day) {
        this.cinemaRoom = cinemaRoom;
        this.people = people;
        this.seat = seat;
        this.day = day;

        price = price();
    }

    public double price(){
        //ciname 1
        if(cinemaRoom == 1){
            if(seat == 1){
                price = 3.8 * people;
            } else if (seat == 2) {
                price = 5.9 * people;
            }else {
                System.out.println("Cinema 1 wrong seat type");
            }
        //cinema 2
        } else if (cinemaRoom == 2) {
            if(seat == 1){
                if(day <= 5){
                    price = 3.3 * people;
                }
                else if(day == 6 || day == 7){
                    price = 4.5 * people;
                }
                else {
                    System.out.println("Cinema 2 seat 1 wrong day");
                }
            } else if (seat == 2) {
                price = 7 * people;
            } else {
                System.out.println("Cinema 2 wrong seat type");
            }
            //cinema 3
        } else if (cinemaRoom == 3) {
            if(day <= 4){
                price = 6 * people;
            } else if (day > 4 && day < 8) {
                price = 7.5 * people;
            } else {
                System.out.println("Cinema 3 wrong day");
            }

        }else {
            System.out.println("Error CinemaRoom not 1-3");
        }
        return price;
    }

    public double getPrice() {
        return price;
    }
}
