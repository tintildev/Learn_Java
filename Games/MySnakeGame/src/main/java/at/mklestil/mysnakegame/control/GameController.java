package at.mklestil.mysnakegame.control;

import at.mklestil.mysnakegame.model.SnakeModel;
import at.mklestil.mysnakegame.view.Food;
import at.mklestil.mysnakegame.view.GameView;
import at.mklestil.mysnakegame.view.Snake;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.util.Duration;

public class GameController {
    private GameView view;
    private ObservableList<Node> snake;
    private Double snakeTailX;
    private Double snakeTailY;
    private Node tail;
    private SnakeModel model = new SnakeModel();
    private Timeline timeline;

    public GameController(GameView view){
        this.view = view;
        startGame();
    }

    private void startGame(){
    view.addFood(randomFoodSpawn());
    view.addSnake(initializeSnake());
    moveSnake();
    }

    private Food randomFoodSpawn(){
        // Logic to randomly spawn food in the game area
        // This method will be called when the game starts or when food is eaten
        Food food = new Food();
        // Set the position of the food randomly within the game area
        int x = (int) (Math.random() * (SnakeModel.GAME_WIDTH - SnakeModel.BLOCK_SIZE) / SnakeModel.BLOCK_SIZE * SnakeModel.BLOCK_SIZE);
        int y = (int) (Math.random() * (SnakeModel.GAME_HEIGHT - SnakeModel.BLOCK_SIZE) / SnakeModel.BLOCK_SIZE * SnakeModel.BLOCK_SIZE);
        food.setX(x);
        return food;
    }

    /**
     * Initializes the snake and starts the game.
     * @return Snake view object
     */
    private Snake initializeSnake(){
        // Logic to initialize the snake and start the game
        Snake snakeView = new Snake();
        snake = snakeView.getSnake();
        // Set initial positions for the snake segments
        for (int i = 0; i < snake.size(); i++) {
            snake.get(i).setTranslateX((snake.size() - i) * SnakeModel.BLOCK_SIZE);
            snake.get(i).setTranslateY(0);
        }
        return snakeView;
    }

    /**
     * Moves the snake in the current direction.
     * @return true if the snake has moved, false otherwise
     */
    private Boolean toRemove(){
        boolean toRemove = snake.size() > 3;
        // Kopf bzw. Ende der Schlange
        if (toRemove) {
            tail = snake.remove(snake.size() - 1);
            snakeTailX = tail.getTranslateX();
            snakeTailY = tail.getTranslateY();
        }
        System.out.println("Boolean toRemove: " + toRemove);
        return toRemove;
    }

    private void getSnakeTailPosition(){
        if(toRemove()){
            snakeTailX = tail.getTranslateX();
            snakeTailY = tail.getTranslateY();
        }else {
            System.out.println("Error: Snake has no tail.");
        }
    }

    private void moveSnake(){
        timeline = new Timeline(new KeyFrame(Duration.seconds(model.getGameSpeed()), event -> {
            if (!model.isRunning()) {
                System.out.println("Game is not running, cannot move snake.");
                return;
            }
        boolean toRemove = toRemove();

        switch (model.getDirection()) {
            case UP:
                snake.get(0).setTranslateY(snake.get(0).getTranslateY() - SnakeModel.BLOCK_SIZE);
                break;
            case DOWN:
                snake.get(0).setTranslateY(snake.get(0).getTranslateY() + SnakeModel.BLOCK_SIZE);
                break;
            case LEFT:
                snake.get(0).setTranslateX(snake.get(0).getTranslateX() - SnakeModel.BLOCK_SIZE);
                break;
            case RIGHT:
                snake.get(0).setTranslateX(snake.get(0).getTranslateX() + SnakeModel.BLOCK_SIZE);
                break;
        }
        // Move the rest of the snake
        for (int i = snake.size() - 1; i > 0; i--) {
            snake.get(i).setTranslateX(snake.get(i - 1).getTranslateX());
            snake.get(i).setTranslateY(snake.get(i - 1).getTranslateY());
        }

        if (toRemove) {
            tail.setTranslateX(snakeTailX);
            tail.setTranslateY(snakeTailY);
            snake.add(tail);
        }
    }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
