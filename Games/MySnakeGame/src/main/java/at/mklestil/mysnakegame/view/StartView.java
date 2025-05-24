package at.mklestil.mysnakegame.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class StartView {
    private VBox root;

    public StartView(){
        startGUI();
    }

    private void startGUI(){
        root = new VBox();
        Label gameName = new Label("My Snake Game");
        HBox gameBox = getGameBox();
        HBox buttonsContainer = getButtonsContainer();
        root.getChildren().addAll(gameName, gameBox, buttonsContainer);
        System.out.println("Create Gui finished");
        
    }

    private HBox getButtonsContainer() {
        HBox theGameBox = new HBox();
        return theGameBox;
    }

    private HBox getGameBox() {
        HBox buttons = new HBox();
        Label speedLabel = new Label("Speed");
        Button startBtn = new Button("Start");
        Label musicLabel = new Label("Music");
        buttons.getChildren().addAll(speedLabel, startBtn, musicLabel);
        return buttons;
    }

    public VBox getRoot(){
        return root;
    }
    
    
}
