/* TicTacToe
 *
 */

package com.example.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Objects;


public class TicTacToe extends Application {
    @Override
    public void start(Stage stage){
        Pane masterPane = new Pane();
        Label title = new Label();
        Label turnLabel = new Label();
        VBox vbox1 = new VBox();
        HBox display = new HBox();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        HBox hBox3 = new HBox();


        Pane pane1 = new Pane();
        Pane pane2 = new Pane();
        Pane pane3 = new Pane();
        Pane pane4 = new Pane();
        pane1.setPrefWidth(500);
        pane1.setPrefHeight(200);
        pane2.setPrefWidth(500);
        pane2.setPrefHeight(200);
        pane3.setPrefWidth(500);
        pane3.setPrefHeight(200);
        pane4.setPrefWidth(750);
        pane4.setPrefHeight(200);

        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();
        Button button9 = new Button();
        button1.setPrefWidth(200);
        button2.setPrefWidth(200);
        button3.setPrefWidth(200);
        button4.setPrefWidth(200);
        button5.setPrefWidth(200);
        button6.setPrefWidth(200);
        button7.setPrefWidth(200);
        button8.setPrefWidth(200);
        button9.setPrefWidth(200);
        button1.setPrefHeight(200);
        button2.setPrefHeight(200);
        button3.setPrefHeight(200);
        button4.setPrefHeight(200);
        button5.setPrefHeight(200);
        button6.setPrefHeight(200);
        button7.setPrefHeight(200);
        button8.setPrefHeight(200);
        button9.setPrefHeight(200);


        hBox1.getChildren().setAll(pane1, button1, button2, button3);
        hBox2.getChildren().setAll(pane2, button4, button5, button6);
        hBox3.getChildren().setAll(pane3, button7, button8, button9);
        display.getChildren().setAll(pane4, title, turnLabel);
        vbox1.getChildren().setAll(display, hBox1, hBox2, hBox3);
        masterPane.getChildren().setAll(vbox1);

        Scene scene = new Scene(masterPane, 320, 240);//
        stage.setTitle("TicTacToe");
        stage.setScene(scene);
        stage.show();

        ArrayList<String> player = new ArrayList<>();
        player.add("X");
        player.add("O");

        //turnLabel.setFont();
        turnLabel.setText("It is now " + player.get(0) + "'s turn");

        button1.setOnAction(actionEvent ->  {
            if(!Objects.equals(button1.getText(), "O") && !Objects.equals(button1.getText(), "X")){
                button1.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
        button2.setOnAction(actionEvent ->  {
            if(!Objects.equals(button2.getText(), "O") && !Objects.equals(button2.getText(), "X")){
                button2.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
        button3.setOnAction(actionEvent ->  {
            if(!Objects.equals(button3.getText(), "O") && !Objects.equals(button3.getText(), "X")){
                button3.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
        button4.setOnAction(actionEvent ->  {
            if(!Objects.equals(button4.getText(), "O") && !Objects.equals(button4.getText(), "X")){
                button4.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
        button5.setOnAction(actionEvent ->  {
            if(!Objects.equals(button5.getText(), "O") && !Objects.equals(button5.getText(), "X")){
                button5.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
        button6.setOnAction(actionEvent ->  {
            if(!Objects.equals(button6.getText(), "O") && !Objects.equals(button6.getText(), "X")){
                button6.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
        button7.setOnAction(actionEvent ->  {
            if(!Objects.equals(button7.getText(), "O") && !Objects.equals(button7.getText(), "X")){
                button7.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
        button8.setOnAction(actionEvent ->  {
            if(!Objects.equals(button8.getText(), "O") && !Objects.equals(button8.getText(), "X")){
                button8.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
        button9.setOnAction(actionEvent ->  {
            if(!Objects.equals(button9.getText(), "O") && !Objects.equals(button9.getText(), "X")){
                button9.setText(player.get(0));
                turnLabel.setText("It is now " + player.get(1) + "'s turn");
                Collections.swap(player, 0, 1);
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}