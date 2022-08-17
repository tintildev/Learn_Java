package at.martinklestil.model;

import javax.swing.*;

public class Scoure {

    private double scoure = 0;
    private long start = 0;
    private long stop = 0;
    private JLabel scoureLabel;

    public Scoure(JLabel scoureLabel) {
        this.scoureLabel = scoureLabel;
    }

    private void berechneScoure() {
        if(start > 0 && stop > 0){

            long temp = stop - start;
            System.out.println(temp);

            // Alternative to just specify seconds
            //long scoure = TimeUnit.SECONDS.convert(temp, TimeUnit.NANOSECONDS);

            double scoure = (double) temp / 1000000000;
            scoureLabel.setText(String.valueOf("reaction time: " + scoure + " seconds"));
        }
    }

    public void setStart(long start) {
        this.start = start;
    }

    public void setStop(long stop) {
        this.stop = stop;
        berechneScoure();
    }
}
