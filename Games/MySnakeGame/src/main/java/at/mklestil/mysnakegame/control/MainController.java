package at.mklestil.mysnakegame.control;

import at.mklestil.mysnakegame.model.SnakeModel;
import at.mklestil.mysnakegame.view.GameView;
import at.mklestil.mysnakegame.view.StartView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
    private static MainController instance;
    private StartView startView;
    private GameView gameView;
    private SnakeModel model;
    private Stage stage;
    private Scene scene;
    
    private MainController(){
        startView = new StartView();
        gameView = new GameView();
        scene = new Scene(startView.getRoot(), 320, 200);
    
    }

    public static MainController getInstance(){
        if(instance == null){
        instance = new MainController();
        }
        return instance;
    }

    public void initializeScenes(){
        
    } 

    public Scene getScene(){
        return scene;
    }
    
}
