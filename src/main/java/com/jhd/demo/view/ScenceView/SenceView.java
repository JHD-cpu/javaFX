package com.jhd.demo.view.ScenceView;

import com.jhd.demo.utils.SystemConfig;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class SenceView {

    private Scene scene ;
    private Group group;
    private Stage stage;
    private ParallelCamera camera;
    public SenceView(Stage stage) {
        this.stage = stage;
        init();
    }
    public void init(){
        this.group= new Group();
        this.scene = new Scene( this.group, SystemConfig.width, SystemConfig.height);
        this.camera = new ParallelCamera();
        scene.setCursor(Cursor.CROSSHAIR);
        this.scene.setCamera(this.camera);
        this.scene.setFill(Color.BLACK);
        this.stage.setScene(scene);
    }

    public Scene getScene() {
        return scene;
    }


    public Group getGroup() {
        return group;
    }

    public Stage getStage() {
        return stage;
    }


    public ParallelCamera getCamera() {
        return camera;
    }

}
