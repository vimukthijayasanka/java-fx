package lk.ijse.dep13.fx.controller;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class MainSceneController {

    public Button btnReset;
    public Button btnRotate;
    public Button btnScaleX;
    public Button btnScaleY;
    public Button btnTranslateX;
    public Button btnTranslateY;
    public Label lblPreview;
    public Button btnFadeIn;
    public Button btnFadeOut;

    public void btnResetOnAction(ActionEvent event) {
        lblPreview.setTranslateX(0);
        lblPreview.setTranslateY(0);
        lblPreview.setScaleX(1);
        lblPreview.setScaleY(1);
        lblPreview.setRotate(0);
        lblPreview.setOpacity(1);
    }

    public void btnScaleXOnAction(ActionEvent event) {
        ScaleTransition st = new ScaleTransition(Duration.millis(250), lblPreview);
        st.setFromX(1);
        st.setToX(1.5);
        st.playFromStart();
    }

    public void btnScaleYOnAction(ActionEvent event) {
        ScaleTransition st = new ScaleTransition(Duration.millis(250), lblPreview);
        st.setFromY(1);
        st.setToY(1.5);
        st.playFromStart();
    }

    public void btnTranslateXOnAction(ActionEvent event) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(500), lblPreview);
        tt.setFromX(-100);
        tt.setToX(0);
        tt.playFromStart();
        //lblPreview.setTranslateX(100);
    }

    public void btnTranslateYOnAction(ActionEvent event) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(500), lblPreview);
        tt.setFromY(100);
        tt.setToY(0);
        tt.playFromStart();
        //lblPreview.setTranslateY(100);
    }

    public void btnRotateOnAction(ActionEvent event) {
        RotateTransition rt = new RotateTransition(Duration.millis(250), lblPreview);
        rt.setFromAngle(-45);
        rt.setToAngle(0);
        rt.playFromStart();
    }


    public void btnFadeInOnAction(ActionEvent actionEvent) {
        FadeTransition ft = new FadeTransition(Duration.seconds(2), lblPreview);
        ft.setFromValue(1);
        ft.setToValue(0);
        ft.playFromStart();
        //lblPreview.setOpacity(0);
    }

    public void btnFadeOutOnAction(ActionEvent actionEvent) {
        FadeTransition ft = new FadeTransition(Duration.seconds(2), lblPreview);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.playFromStart();
    }
}
