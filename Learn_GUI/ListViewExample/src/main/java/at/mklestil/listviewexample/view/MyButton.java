package at.mklestil.listviewexample.view;

import javafx.scene.control.Button;

public class MyButton extends Button {
    private String type = "";

    public MyButton(String name, String value) {
        this.setText(name);
        this.type = value;
        this.setMaxWidth(Double.MAX_VALUE);

    }

    public String getType() {
        return type;
    }
}
