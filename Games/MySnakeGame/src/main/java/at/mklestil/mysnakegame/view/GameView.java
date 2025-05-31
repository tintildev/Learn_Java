package at.mklestil.mysnakegame.view;

import at.mklestil.mysnakegame.model.SnakeModel;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

public class GameView {
    private Pane root;
    private ObservableList<Node> snake;

    public GameView() {
        startGUI();
    }

    private void startGUI() {
        root = new Pane();
        root.setPrefHeight(SnakeModel.GAME_HEIGHT);
        root.setPrefWidth(SnakeModel.GAME_WIDTH);
        root.setStyle("-fx-background-size: 20 20;"
                + "-fx-background-repeat: repeat;"
                + "-fx-border-color: black;"
                + "-fx-border-width: 1px;"
                + "-fx-border-style: solid;"
        );
    }

    public void addFood(Food food){
        root.getChildren().add(food);
    }

    public Pane getRoot() {
        return root;
    }

    public void addSnake (Snake snake) {
        root.getChildren().add(snake);
    }

}
