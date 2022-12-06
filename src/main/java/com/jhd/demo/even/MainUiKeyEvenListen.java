package com.jhd.demo.even;

import com.jhd.demo.utils.NodeUtils;
import com.jhd.demo.view.ScenceView.SenceView;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.ParallelCamera;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;
import java.util.Random;

public class MainUiKeyEvenListen {

    private SenceView senceView;

    private ParallelCamera camera;
    public MainUiKeyEvenListen(SenceView stage) {
        this.senceView=stage;
        setCloseWindowEven();
        setOnMouseMoved();
        test();
    }
    private void test(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Node sphere2 = NodeUtils.nodeMap.get("sphere2");
                double a=0;
                while (true){
                     a++;
                     if (a==1000){
                         a=0;
                     }
                    try {
                        Thread.sleep(1000/60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(a);
                    sphere2.setTranslateX(a);
                }

            }
        }).start();

    }
    private void setOnMouseMoved(){
        camera = senceView.getCamera();
        camera.setMouseTransparent(true);
        senceView.getScene().setOnMouseMoved( (mouseEvent) ->{
            double sceneX = mouseEvent.getSceneX();
            double sceneY = mouseEvent.getSceneY();


        });
    }
    private void setCloseWindowEven(){
        Platform.setImplicitExit(false);
        senceView.getStage().setOnCloseRequest(windowEvent -> {
            windowEvent.consume();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("退出程序！！");
            alert.setResizable(false);
            alert.setContentText("您确定要退出吗？");
            alert.setHeaderText(null);
            Optional<ButtonType> buttonType = alert.showAndWait();
            if(ButtonType.OK==buttonType.get()){
                Platform.exit();
            }
        });
    }
}
