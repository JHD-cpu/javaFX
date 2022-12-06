package com.jhd.demo.view.MainView;

import com.jhd.demo.background.BgDraw;
import com.jhd.demo.even.MainUiKeyEvenListen;
import com.jhd.demo.utils.SystemConfig;
import com.jhd.demo.view.ScenceView.SenceView;
import javafx.application.Application;
import javafx.scene.input.KeyCharacterCombination;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class MainView extends Application {

    private  SenceView senceView ;
    private BgDraw bgDraw;
    private MainUiKeyEvenListen mainUiKeyEvenListen;
    private Stage stage;
    @Override
    public void start(Stage stage) throws Exception {

        this.senceView=new SenceView(stage);
        this.bgDraw=new BgDraw(   this.senceView);
        this.mainUiKeyEvenListen = new MainUiKeyEvenListen(this.senceView);
        this.stage=stage;
        initPage();
    }
    private void initPage(){
        this.stage.setWidth(SystemConfig.width);
        this.stage.setHeight(SystemConfig.height);
        this.stage.setTitle("TEST3D");
        this.stage.initStyle(StageStyle.TRANSPARENT);
        this.setFullScreen();
        this.stage.show();

    }
    @Override
    public void init() throws Exception {
        super.init();
    }

    private void  setFullScreen(){
        this.stage.setFullScreenExitHint("");
        this.stage.setFullScreenExitKeyCombination(new KeyCharacterCombination("NO_MATCH"));
        this.stage.setFullScreen(true);
        this.stage.setResizable(false);
    }

}