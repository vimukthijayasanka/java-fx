package lk.ijse.dep13.fx.controller;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainSceneController {
    public AnchorPane container;

    public void containerOnMouseClicked(MouseEvent mouseEvent) {
        System.out.println("Target: " + mouseEvent.getTarget());
        System.out.println("Source: " + mouseEvent.getSource());
    }
}