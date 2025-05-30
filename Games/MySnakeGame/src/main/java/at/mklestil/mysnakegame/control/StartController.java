package at.mklestil.mysnakegame.control;

import at.mklestil.mysnakegame.view.StartView;

public class StartController {

    public StartController(StartView startView) {
        // Initialize the controller with the view
        startView.getStartBtn().setOnAction(event -> {
            SceneManager.getInstance().showGameView();
        });

    }
}
