package com.example.demo;

import javafx.animation.Animation;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.TimerTask;

import static com.example.demo.NewThread.makeTile;

public class HelloApplication extends Application {
    public static int scoreCount = 0;
    public static int count = 0;
    public static Group group = new Group();
    @Override
    public void start(Stage stage) throws InterruptedException {



        makeTile();
        Scene scene = new Scene(group, 2560, 1440);
        stage.setTitle("Osu");
        stage.setScene(scene);
        stage.show();




    }

    public static void main(String[] args) {
        launch();
    }
}