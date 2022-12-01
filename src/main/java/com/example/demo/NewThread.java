package com.example.demo;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.util.TimerTask;

import static com.example.demo.HelloApplication.count;
import static com.example.demo.HelloApplication.scoreCount;
import static com.example.demo.HelloApplication.group;

public class NewThread extends Thread {

    public static void makeTile() {
        Image image = new Image("C:\\Users\\Christia.Phillips\\Documents\\Java Game\\demo\\src\\main\\resources\\com\\example\\demo\\PatrickByrne (2).png");
        ImageView imageView = new ImageView();
        imageView = new ImageView();
        imageView.setFitHeight(256);
        imageView.setFitWidth(256);
        imageView.setX(count * 256);
        count++;
        imageView.setY(0);
        imageView.setPreserveRatio(false);
        imageView.setImage(image);
        TranslateTransition translate1 = new TranslateTransition();
        SequentialTransition seqTransition = new SequentialTransition();

        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                scoreCount++;
                System.out.println(scoreCount);
            }
        });

        translate1.setNode(imageView);

        translate1.setToY(1184);


        translate1.setDuration(Duration.millis(1000));
        seqTransition.getChildren().add(translate1);
        group.getChildren().addAll(imageView);


        seqTransition.play();
    }
}


