package at.mklestil.pomodorotimer.control;

import at.mklestil.pomodorotimer.view.MainWindow;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class MyController {
    private MainWindow view;
    private int workTime = 25 * 60; // 25 Minuten
    private int remainingTime = workTime;
    private Timeline timeline;

    private int progress = 0;


    public MyController(MainWindow view) {
        this.view = view;
        this.view.getStartButton().setOnAction(e -> startTimer());
        this.view.getBreakButton().setOnAction(e -> pauseTimer());
        this.view.getResetButton().setOnAction(e -> resetTimer());

        this.view.getPlus().setOnAction(e -> plusTime());
        this.view.getMinus().setOnAction(e -> minusTime());

    }

    private void plusTime() {
        workTime = workTime + 60; // 1 min;
        remainingTime = workTime;
        view.getTimeLabel().setText(formatTime(remainingTime));
    }
    private void minusTime() {
        // no negativ time
        if (workTime > 60) {
            workTime = workTime - 60; // 1 min;
            remainingTime = workTime;
            view.getTimeLabel().setText(formatTime(remainingTime));
        }
    }

    private void updateTimer() {
        if (remainingTime > 0) {
            remainingTime--;
            double progressTime = (double) (workTime - remainingTime) / workTime;
            view.getProgress().setProgress(progressTime);
            view.getTimeLabel().setText(formatTime(remainingTime));

            //Change Images
            if (workTime > 0) {  // Fortschritt erhöhen
                progress = (int) (progressTime * 100);

                // calculate image stage with the progress
                int stage = progress / 20;  // 5 images, at all 20%
                //System.out.println("% : " + progress / 20);

                // check stage and image length
                if(stage >= 0 && stage < view.getPlantStages().length) {
                    view.getPlantImageView().setImage(view.getPlantStages()[stage]);
                }
            }
        }
        else {
            // Timer-Ende
            pauseTimer();
        }
    }

    public void startTimer(){
        if (timeline == null || timeline.getStatus() == Timeline.Status.STOPPED) {
            timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateTimer()));
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
            view.getStatus().setText("Do not give up!");
            view.getPlantImageView().setImage(view.getPlantStages()[1]);
        }else {
            //Pause
            timeline.play();
            view.getStatus().setText("Do not give up!");
        }
    }

    private void pauseTimer() {
        if (timeline != null) {
            timeline.pause();
            view.getStatus().setText("Wait");
        }
    }

    private void resetTimer() {
        if (timeline != null) {
            timeline.stop();
            view.getStatus().setText("Ready to start!");
        }
        remainingTime = workTime;  // Reset remainingTime to workTime
        view.getTimeLabel().setText(formatTime(remainingTime)); //reset
        view.getProgress().setProgress(0); // reset progress
        view.getPlantImageView().setImage(view.getPlantStages()[0]); //reset image
    }

    private String formatTime(int seconds) {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d", minutes, secs);
    }

}
