package com.kodilla.test;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.text.Text;


public class TestGame extends Application {
    private Image imageBack = new Image("file:/Users/darekmarta/Desktop/Aplikacje Java/Football.jpg");
    private Image playerTeam1 = new Image ("file:/Users/darekmarta/Desktop/Aplikacje Java/red.png");
    private Image playerTeam2 = new Image ("file:/Users/darekmarta/Desktop/Aplikacje Java/blue.png");
    private Image imageBall = new Image("file:/Users/darekmarta/Desktop/Aplikacje Java/ball.png");
    private Image goalLeft = new Image ("file:/Users/darekmarta/Desktop/Aplikacje Java/left.png");
    private Image goalLeft2 = new Image ("file:/Users/darekmarta/Desktop/Aplikacje Java/left2.png");
    private Image goalRight = new Image ("file:/Users/darekmarta/Desktop/Aplikacje Java/right.png");
    private Image goalRight2 = new Image ("file:/Users/darekmarta/Desktop/Aplikacje Java/right2.png");
    private Image team1 = new Image ("file:/Users/darekmarta/Desktop/Aplikacje Java/nl.png");
    private Image team2 = new Image ("file:/Users/darekmarta/Desktop/Aplikacje Java/ar.png");
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private static final int KEYBOARD_MOVEMENT_DELTA = 25;

    @Override
    public void start(Stage stage) {
        BackgroundSize backgroundSize = new BackgroundSize(790, 500, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        Pane canvas = new Pane();
        Scene scene = new Scene(canvas, 755, 475);
        ImageView ball = new ImageView(imageBall);
        ImageView player1 = new ImageView(playerTeam1);
        ImageView player2 = new ImageView(playerTeam2);
        ImageView goalL = new ImageView(goalLeft);
        ImageView goalL2 = new ImageView(goalLeft2);
        ImageView goalR = new ImageView(goalRight);
        ImageView goalR2 = new ImageView(goalRight2);
        ImageView teamL = new ImageView(team1);
        ImageView teamR = new ImageView(team2);

        Text text = new Text();
        Text text1 = new Text();
        text.setFill(Color.WHITE);
        text1.setFill(Color.WHITE);
        Button newBtn = new Button("Press and hover");

        newBtn.relocate(320, -1);
        ball.setFitHeight(15);
        ball.setFitWidth(15);
        ball.relocate(370, 232);
        player1.relocate(60, 228);
        player2.relocate(670, 228);
        goalL.relocate(-26, 179);
        goalL2.relocate(-26, 242);
        goalR.relocate(717, 179);
        goalR2.relocate(717, 242);
        teamL.relocate(270, 1);
        teamR.relocate(450, 1);
        text.setText("0");
        text1.setText("0");
        text.relocate(500, 5);
        text1.relocate(250, 5);

        canvas.getChildren().add(ball);
        canvas.getChildren().add(player1);
        canvas.getChildren().add(player2);
        canvas.setBackground(background);
        canvas.getChildren().add(text);
        canvas.getChildren().add(text1);
        canvas.getChildren().add(goalL);
        canvas.getChildren().add(goalL2);
        canvas.getChildren().add(goalR);
        canvas.getChildren().add(goalR2);
        canvas.getChildren().add(teamL);
        canvas.getChildren().add(teamR);
        canvas.getChildren().add(newBtn);

        stage.setTitle("Football game");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(20), new EventHandler<ActionEvent>() {
            double dx = 8; //ruch wzdłuż osi x lub prędkość
            double dy = 4; //ruch wzdłuż osi y

            @Override
            public void handle(ActionEvent event) {
                //ruch piłki
                newBtn.setOnAction(((e)-> {
                    ball.setLayoutX(370);
                    ball.setLayoutY(232);
                    newBtn.fire();
                }));
                if (newBtn.isArmed()){
                    ball.setLayoutX(ball.getLayoutX() + dx);
                    ball.setLayoutY(ball.getLayoutY() + dy);
                }
                Bounds bounds = canvas.getBoundsInLocal();
                //odwrócenie kierunku po osiągnięciu granicy lewej, prawej obszaru
                if (ball.getLayoutX() <= (bounds.getMinX() + ball.getFitWidth()*3) || ball.getLayoutX() >= (bounds.getMaxX() - ball.getFitWidth()*4)) {
                    dx = -dx;
                }
                //odwrócenie kierunku po osiągnięciu granicy górnej, dolnej obszaru
                if ((ball.getLayoutY() <= (bounds.getMinY() + ball.getFitHeight()*2)) || ball.getLayoutY() >= (bounds.getMaxY() - ball.getFitHeight())) {
                    dy = -dy;
                }
                if (ball.getBoundsInParent().intersects(player1.getBoundsInParent())) {
                    dx = -dx;
                    dy = -dy;
                }
                if (ball.getBoundsInParent().intersects(player2.getBoundsInParent())) {
                    dx = -dx;
                    dy = dy;
                }
                if ((ball.getLayoutY()>=200&&ball.getLayoutY()<=270&&ball.getLayoutX()<=20)){
                    scorePlayer2++;
                    text.setText(Integer.toString(scorePlayer2));
                    text.relocate(500, 5);
                    ball.relocate(370, 228);

                }
                if ((ball.getLayoutY()>=200&&ball.getLayoutY()<=270&&ball.getLayoutX()>=715)){
                    scorePlayer1++;
                    text1.setText(Integer.toString(scorePlayer1));
                    text1.relocate(250, 5);
                    ball.relocate(370, 228);
                }
            }

        }));
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event1) {
                switch (event1.getCode()) {
                    case W:
                        if (player1.getLayoutY()<=10){
                            player1.setLayoutY(player1.getLayoutY());
                        }else{
                            player1.setLayoutY(player1.getLayoutY() - KEYBOARD_MOVEMENT_DELTA);
                        }
                        break;
                    case D:
                        if (player1.getLayoutX()>=710){
                            player1.setLayoutX(player1.getLayoutX());
                        }else{
                            player1.setLayoutX(player1.getLayoutX() + KEYBOARD_MOVEMENT_DELTA);
                        }
                        break;
                    case S:
                        if (player1.getLayoutY()>=450){
                            player1.setLayoutY(player1.getLayoutY());
                        }else{
                            player1.setLayoutY(player1.getLayoutY() + KEYBOARD_MOVEMENT_DELTA);
                        }
                        break;
                    case A:
                        if (player1.getLayoutX()<=15){
                            player1.setLayoutX(player1.getLayoutX());
                        }else{
                            player1.setLayoutX(player1.getLayoutX() - KEYBOARD_MOVEMENT_DELTA);
                        }
                        break;
                    case UP:
                        if (player2.getLayoutY()<=10){
                            player2.setLayoutY(player2.getLayoutY());
                        }else{
                            player2.setLayoutY(player2.getLayoutY() - KEYBOARD_MOVEMENT_DELTA);
                        }
                        break;
                    case RIGHT:
                        if (player2.getLayoutX()>=710) {
                            player2.setLayoutX(player2.getLayoutX());
                        }else{
                            player2.setLayoutX(player2.getLayoutX() + KEYBOARD_MOVEMENT_DELTA);
                        }
                        break;
                    case DOWN:
                        if (player2.getLayoutY()>=450){
                            player2.setLayoutY(player2.getLayoutY());
                        }else {
                            player2.setLayoutY(player2.getLayoutY() + KEYBOARD_MOVEMENT_DELTA);
                        }
                        break;
                    case LEFT:
                        if (player2.getLayoutX()<=20) {
                            player2.setLayoutX(player2.getLayoutX());
                        }else {
                            player2.setLayoutX(player2.getLayoutX() - KEYBOARD_MOVEMENT_DELTA);
                        }
                        break;
                }
            }
        });
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    public static void main(String[] args) {
        launch();
    }
}
