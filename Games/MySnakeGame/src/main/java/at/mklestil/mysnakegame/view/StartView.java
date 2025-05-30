package at.mklestil.mysnakegame.view;

import at.mklestil.mysnakegame.model.SnakeModel;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class StartView {
    private BorderPane root;
    private Button startBtn;

    public StartView() {
        startGUI();
    }

    private void startGUI() {
        root = new BorderPane();
        root.setPrefHeight(SnakeModel.GAME_HEIGHT);
        root.setPrefWidth(SnakeModel.GAME_WIDTH);
        root.setTop(getTitelContainer());
        root.setCenter(getGameContainer());
        root.setBottom(getButtonsContainer());
        System.out.println("Create Gui finished");

    }

    private HBox getTitelContainer() {
        HBox titelContainer = new HBox(20);
        titelContainer.setAlignment(Pos.CENTER);
        Label gameName = new Label("My Snake Game");
        titelContainer.getChildren().addAll(gameName);
        return titelContainer;
    }

    private HBox getGameContainer() {
        HBox theGameBox = new HBox();
        return theGameBox;
    }

    private HBox getButtonsContainer() {
        HBox buttons = new HBox(20);
        Label speedLabel = new Label("Speed");
        startBtn = new Button("Start");
        Label musicLabel = new Label("Music");
        buttons.getChildren().addAll(speedLabel, startBtn, musicLabel);
        buttons.setAlignment(Pos.CENTER);
        return buttons;
    }

    public BorderPane getRoot() {
        return root;
    }

    public Button getStartBtn() {
        return startBtn;
    }
}
