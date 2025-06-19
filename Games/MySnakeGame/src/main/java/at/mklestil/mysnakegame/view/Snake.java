package at.mklestil.mysnakegame.view;

import at.mklestil.mysnakegame.model.SnakeModel;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.io.InputStream;


public class Snake extends Group {
    private ObservableList<Node> snake;
    private Group snakeBody;


    public Snake() {
        snakeBody = this;
        // Initialize the snake view
        startGUI();
    }

    private void startGUI() {
        // ObservableList to hold the snake's body segments
        snake = snakeBody.getChildren();
        // Create the initial snake segment (head)
        Rectangle head = new Rectangle(SnakeModel.BLOCK_SIZE, SnakeModel.BLOCK_SIZE);
        addImage("/img/head.png", head);
        Rectangle body = new Rectangle(SnakeModel.BLOCK_SIZE, SnakeModel.BLOCK_SIZE);
        addImage("/img/body.png", body);
        Rectangle tail = new Rectangle(SnakeModel.BLOCK_SIZE, SnakeModel.BLOCK_SIZE);
        addImage("/img/tail.png", tail);

        // Set the position and style of the head
        head.setX(3 * SnakeModel.BLOCK_SIZE);
        head.setY(1);
        body.setX(2 * SnakeModel.BLOCK_SIZE);
        body.setY(1);
        tail.setX(SnakeModel.BLOCK_SIZE);
        tail.setY(1);

        // Add to group and observable list
        snake.add(0, head);
        snake.add(1, body);
        snake.add(2, tail);


    }

    public ObservableList<Node> getSnake() {
        // Return the observable list of snake segments
        return snake;
    }

    private void addImage(String path, Rectangle rectangle){
        // Load the image from resources
        InputStream imageStream = getClass().getResourceAsStream(path);
        if (imageStream != null) {
            Image foodImage = new Image(imageStream);
            ImagePattern imagePattern = new ImagePattern(foodImage);
            rectangle.setFill(imagePattern);
        } else {
            // Fallback
            rectangle.setStyle("-fx-fill: E51AAA;");
        }
    }
}
