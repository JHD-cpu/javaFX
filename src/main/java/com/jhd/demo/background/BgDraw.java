package com.jhd.demo.background;

import com.jhd.demo.utils.NodeUtils;
import com.jhd.demo.utils.SystemConfig;
import com.jhd.demo.view.ScenceView.SenceView;
import javafx.geometry.Bounds;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class BgDraw {
    private SenceView senceView;
    private Scene scene;
    private  Camera camera ;
    private   Group group;
    public BgDraw(SenceView stage) {
        this.senceView=stage;
        initDraw();
    }
    public void initDraw(){
        this.scene = this.senceView.getScene();
        this.camera = this.senceView.getCamera();
        this.group = this.senceView.getGroup();
        drawPoint(100,Color.BLUE,SystemConfig.width*0.4,SystemConfig.height/2,"sphere1");
        drawPoint(30,Color.YELLOW,SystemConfig.width*0.6,SystemConfig.height/2,"sphere2");
    }
    public void drawPoint(double radius,Color color,double x,double y,String name){
        Sphere sphere = new Sphere();
        sphere.setRadius(radius);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(color);
        sphere.setMaterial(phongMaterial);
        group.getChildren().add(sphere);
        sphere.setLayoutX(x);
        sphere.setLayoutY(y);
        NodeUtils.nodeMap.put(name,sphere);
        NodeUtils.nodeList.add(sphere);
    }
}
