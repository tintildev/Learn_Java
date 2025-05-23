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
    private Stage stage = new Stage();
    private Scene scene;
    
    private SceneManager(){
        startView = new StartView();
        gameView = new GameView();
        scene = new Scene(startView.getRoot(), 320, 200);
        stage.setScene(scene);
    
    }

    public static SceneManager getInstance(Stage mStage){
        if(instance == null){
            instance = new SceneManager();
        }
        instance.setStage(mStage);
        return instance;
    }

    public void initializeScenes(){
        
    } 

    public Scene getScene(){
        return scene;
    }

    private void setStage(Stage stage){
        this.stage = stage;
    }
    
}
