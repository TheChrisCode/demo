package com.example.demo;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    public int scoreCount = 0;
    @Override
    public void start(Stage stage) throws InterruptedException {

        Image image = new Image("C:\\Users\\Christia.Phillips\\Documents\\Java Game\\demo\\src\\main\\resources\\com\\example\\demo\\PatrickByrne (2).png");
        Group group = new Group();

        ImageView imageView[] = new ImageView[10];
        KeyEvent keyEvent[] = new KeyEvent[10];
        Rectangle rectangle[] = new Rectangle[9];

        Line line[] = new Line[9];
        for (int y = 0; y < 9; y++) {
            rectangle[y] = new Rectangle();
            rectangle[y].setHeight(256);
            rectangle[y].setWidth(2560);
            rectangle[y].setX((y) * 256);
            rectangle[y].setY(1184);
            rectangle[y].setFill(Color.RED);
            group.getChildren().add(rectangle[y]);
            line[y] = new Line((y+1) * 256, 0, (y+1) * 256, 1500);
            group.getChildren().add(line[y]);

        }

        TranslateTransition translate1[] = new TranslateTransition[10];
        ParallelTransition parallelTransition = new ParallelTransition();



        for (int i = 0; i < 10; i++) {

            imageView[i] = new ImageView();
            imageView[i].setFitHeight(256);
            imageView[i].setFitWidth(256);
            imageView[i].setX(Math.floor(Math.random()*9) * 256);
            imageView[i].setY(-256 * (i + 1));


            imageView[i].setPreserveRatio(false);
            imageView[i].setImage(image);

            imageView[i].setOnKeyTyped(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent keyEvent) {
                    if(keyEvent.getCode() == )
                    scoreCount++;
                    System.out.println(scoreCount);
                }
            });
            translate1[i] = new TranslateTransition();

            translate1[i].setNode(imageView[i]);

            translate1[i].setToY(5120);


            translate1[i].setDuration(Duration.millis(10000));
            parallelTransition.getChildren().add(translate1[i]);
            group.getChildren().addAll(imageView[i]);


            System.out.println(i);
        }

        parallelTransition.setCycleCount(1);
        parallelTransition.setAutoReverse(false);
        parallelTransition.play();

        Scene scene = new Scene(group, 2560, 1440);
        stage.setTitle("Osu");
        stage.setScene(scene);
        stage.show();




    }

    public static void main(String[] args) {
        launch();
    }
}