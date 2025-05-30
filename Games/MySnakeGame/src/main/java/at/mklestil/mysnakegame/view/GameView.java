package at.mklestil.mysnakegame.view;
import at.mklestil.mysnakegame.model.SnakeModel;
import javafx.scene.layout.Pane;

public class GameView {
    private Pane root;

    public GameView() {
        startGUI();
    }

    private void startGUI() {
        root = new Pane();
        root.setPrefHeight(SnakeModel.GAME_HEIGHT);
        root.setPrefWidth(SnakeModel.GAME_WIDTH);
        root.setStyle( "-fx-background-size: 20 20;"
        + "-fx-background-repeat: repeat;"
                + "-fx-border-color: black;"
                + "-fx-border-width: 1px;"
                + "-fx-border-style: solid;"
        );
    }

    public Pane getRoot() {
        return root;
    }

}
