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
            view.getProgressIndicator().setProgress((double) (workTime - remainingTime) / workTime);;
            view.getTimeLabel().setText(formatTime(remainingTime));
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
        }else {
            //Pause
            timeline.play();
        }
    }

    private void pauseTimer() {
        if (timeline != null) {
            timeline.pause();
        }
    }

    private void resetTimer() {
        if (timeline != null) {
            timeline.stop();

        }
        remainingTime = workTime;  // Reset remainingTime to workTime
        view.getTimeLabel().setText(formatTime(remainingTime)); //reset
        view.getProgressIndicator().setProgress(0); // reset progress
    }

    private String formatTime(int seconds) {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d", minutes, secs);
    }

}
