package at.mklestil.mysnakegame.control;

import at.mklestil.mysnakegame.model.SnakeModel;
import at.mklestil.mysnakegame.view.Food;
import at.mklestil.mysnakegame.view.GameView;
import at.mklestil.mysnakegame.view.Snake;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class GameController {
    private GameView view;
    private ObservableList<Node> snake;
    private Double snakeTailX;
    private Double snakeTailY;
    private Node tail;
    private SnakeModel model = new SnakeModel();

    public GameController(GameView view){
        this.view = view;
        startGame();
    }

    private void startGame(){
    view.addFood(randomFoodSpawn());
    view.addSnake(initializeSnake());
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
        return snakeView;
    }

    /**
     * Moves the snake in the current direction.
     * @return true if the snake has moved, false otherwise
     */
    private Boolean toRemove(){
        boolean toRemove = snake.size() > 1;
        // Kopf bzw. Ende der Schlange
        if (toRemove) {
            tail = snake.remove(snake.size() - 1);
        } else {
            tail = snake.get(0);
        }
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
    }
}
