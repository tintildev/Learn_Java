package at.martinklestil.lasagna;

public class Lasagna {

    private int minForBestLasagna = 40;

    // returns how many minutes the lasagna should be in the oven
    public int expectedMinutesInOven(){
        return minForBestLasagna;
    }

    // returns heat
    public int topAndBottomHeat(){
        return 180;
    }

    // remaining Time
    public int remainingMinutesInOven(int value){
        int remainingMinutes = minForBestLasagna - value;
        return remainingMinutes;
    }

    // pumpkin lasagna
    public boolean pumpkinLasagna(){
        return true;
    }


    // Minutes for add Layers
    public int preparationTimeInMinutes(int layers){
        int time = layers * 2;
        return time;
    }

    // Total work time
    public int totalTimeInMinutes(int layers, int ovenTime){
        int time = (layers * 2) + ovenTime;
        return time;
    }

}

