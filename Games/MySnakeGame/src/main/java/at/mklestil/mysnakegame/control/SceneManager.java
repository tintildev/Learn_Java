package at.mklestil.mysnakegame.control;

import at.mklestil.mysnakegame.model.SnakeModel;
import at.mklestil.mysnakegame.view.GameView;
import at.mklestil.mysnakegame.view.StartView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
    private static SceneManager instance;
    private StartView startView;
    private GameView gameView;
    private SnakeModel model;
    private Stage stage;
    private final Scene scene;

    private SceneManager() {
        startView = new StartView();
        StartController startController = new StartController(startView);
        gameView = new GameView();
        GameController gameController = new GameController();

        model = new SnakeModel();
        scene = new Scene(startView.getRoot(), SnakeModel.GAME_WIDTH, SnakeModel.GAME_HEIGHT);

    }

    public static SceneManager getInstance() {
        if (instance == null) {
            instance = new SceneManager();
        }
        return instance;
    }

    public void initializeScenes() {

    }

    public Scene getScene() {
        return scene;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void showStartView() {
        scene.setRoot(startView.getRoot()); // If scene already exists
        stage.setScene(scene);
        stage.setTitle("My Snake Game");
        stage.show(); // show
    }

    public void showGameView() {
        scene.setRoot(gameView.getRoot()); // If scene already exists
        stage.setScene(scene);
        stage.setTitle("My Snake Game - Playing");
        stage.show(); // show
    }

}
