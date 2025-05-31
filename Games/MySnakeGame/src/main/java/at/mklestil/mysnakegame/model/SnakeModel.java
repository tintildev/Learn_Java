package at.mklestil.mysnakegame.model;

import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class SnakeModel {

    public enum Direction {
        UP, DOWN, LEFT, RIGHT;
    }

    public static final int BLOCK_SIZE = 20;
    public static final int GAME_WIDTH = 30 * BLOCK_SIZE;
    public static final int GAME_HEIGHT = 20 * BLOCK_SIZE;

    private static double gameSpeed = 0.2;
    private static boolean isEndless = true; //frame

    private static Direction direction = Direction.RIGHT;
    private static boolean mouved = false;
    private static boolean running = false;

    private Timeline timeline = new Timeline();

    private int score = 0;


}
