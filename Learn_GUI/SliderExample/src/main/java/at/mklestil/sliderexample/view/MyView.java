package at.mklestil.sliderexample.view;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MyView{

    private BorderPane root;
    private Slider opacitySlider;
    private Slider sepiaSlider;
    private Slider scaleSlider;
    private Label opacityValue;
    private Label sepiaValue;
    private Label scaleValue;
    private MyMenubar menu;

    private ImageView imageView;

    public MyView() {
        root = new BorderPane();
        menu = new MyMenubar();
        root.setTop(menu);

        GridPane gridPane = new GridPane();


        //Image
        if(getClass().getResourceAsStream("/Images/image.png") != null){
            Image image = new Image(getClass().getResourceAsStream("/Images/image.png"));
            imageView = new ImageView(image);
            gridPane.add(imageView, 0, 0);
        }

        Separator separator = new Separator();
        gridPane.add(separator, 0, 1);
        gridPane.add(getOpacityBox(), 0, 2);
        gridPane.add(getSepiaBox(), 0, 3);
        gridPane.add(getScaleBox(), 0, 4);

        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10));

        root.setCenter(gridPane);
    }

    public BorderPane getRoot() {
        return root;
    }

    public HBox getOpacityBox(){
        HBox opacityBox = new HBox(5);

        Label opacityLabel = new Label("Opacity Level");
        opacitySlider = new Slider(0,1,1);
        opacityValue = new Label(Double.toString(opacitySlider.getValue()));
        opacityBox.getChildren().addAll(opacityLabel, opacitySlider, opacityValue);

        return  opacityBox;
    }

    public HBox getSepiaBox(){
        HBox sepiaBox = new HBox(5);

        Label sepiaLabel = new Label("Sepia Level");
        sepiaSlider = new Slider(0,1,1);
        sepiaValue = new Label(Double.toString(sepiaSlider.getValue()));
        sepiaBox.getChildren().addAll(sepiaLabel, sepiaSlider, sepiaValue);
        return  sepiaBox;
    }

    public HBox getScaleBox(){
        HBox scaleBox = new HBox(5);

        Label scaleLabel = new Label("Scaling Level");
        scaleSlider = new Slider(0,1,1);
        scaleValue = new Label(Double.toString(scaleSlider.getValue()));
        scaleBox.getChildren().addAll(scaleLabel, scaleSlider, scaleValue);
        return  scaleBox;
    }

    public Slider getOpacitySlider() {
        return opacitySlider;
    }

    public Slider getSepiaSlider() {
        return sepiaSlider;
    }

    public Slider getScaleSlider() {
        return scaleSlider;
    }

    public Label getOpacityValue() {
        return opacityValue;
    }

    public Label getSepiaValue() {
        return sepiaValue;
    }

    public Label getScaleValue() {
        return scaleValue;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public MyMenubar getMenu() {
        return menu;
    }
}
