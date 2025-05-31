package at.mklestil.mysnakegame.view;
import at.mklestil.mysnakegame.model.SnakeModel;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;

import java.util.List;


public class Snake extends Group {
    private ObservableList<Node> snake;
    private Group snakeBody;


    public Snake() {
        snakeBody = this;
        // Initialize the snake view
        startGUI();
    }

    private void startGUI() {
        // Set up the snake's appearance and behavior
        snakeBody.setStyle("-fx-background-color: green;");
        // ObservableList to hold the snake's body segments
        snake = snakeBody.getChildren();
        // Create the initial snake segment (head)
        Rectangle head = new Rectangle(SnakeModel.BLOCK_SIZE, SnakeModel.BLOCK_SIZE);
        // Add to group and observable list
        snake.add(head);
        // Set the position and style of the head
        head.setX(1);
        head.setY(1);
        head.setStyle("-fx-fill: green;");
    }

    public ObservableList<Node> getSnake() {
        // Return the observable list of snake segments
        return snake;
    }
}
