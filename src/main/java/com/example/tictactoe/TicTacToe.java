/* TicTacToe
 *Caleb Perry
 * 10/15/2021
 * the purpose of this project is to use javafx to create tic-tac-toe
 * I did this by using buttons that displayed who clicked on theme (either X or O)
 * if when someone clicked on a button, and it made a line it says that that person won
 * after the game is over you can press the reset button to reset the board
 */

package com.example.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Objects;


public class TicTacToe extends Application {
    public  static boolean gameOver;
    public static ArrayList<String> player = new ArrayList<>();
    public static ArrayList<Boolean> check = new ArrayList<>();
    @Override
    public void start(Stage stage){
        //declared all the needed instantiations
        Pane masterPane = new Pane();
        Label title = new Label();
        Label turnLabel = new Label();
        //HBox's go in VBox
        VBox vbox1 = new VBox();
        //buttons go in HBox's
        HBox display = new HBox();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        HBox hBox3 = new HBox();
        Font fontForLabel = new Font(50);
        Font fontForLetter = new Font(25);


        //the purpose of these panes is to push the board and the text into the center
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
        pane4.setPrefWidth(625);
        pane4.setPrefHeight(200);

        //these buttons act as the board
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();
        Button button9 = new Button();
        Button button10 = new Button();
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

        //sets the font for the button letters, so they aren't minuscule
        button1.setFont(fontForLetter);
        button2.setFont(fontForLetter);
        button3.setFont(fontForLetter);
        button4.setFont(fontForLetter);
        button5.setFont(fontForLetter);
        button6.setFont(fontForLetter);
        button7.setFont(fontForLetter);
        button8.setFont(fontForLetter);
        button9.setFont(fontForLetter);


        //this button acts as a reset that resets the board
        button10.setText("Reset");
        //buttons go into HBox's and HBox's go into VBox which is displayed
        pane4.getChildren().setAll(button10);
        hBox1.getChildren().setAll(pane1, button1, button2, button3);
        hBox2.getChildren().setAll(pane2, button4, button5, button6);
        hBox3.getChildren().setAll(pane3, button7, button8, button9);
        display.getChildren().setAll(pane4, title, turnLabel);
        vbox1.getChildren().setAll(display, hBox1, hBox2, hBox3);
        masterPane.getChildren().setAll(vbox1);

        Scene scene = new Scene(masterPane, 320, 240);
        stage.setTitle("TicTacToe");
        stage.setScene(scene);
        stage.show();

        //List of X and O that alternates between button presses
        player.add("X");
        player.add("O");


        //sets font size for turnLabel and says whose turn it is
        turnLabel.setFont(fontForLabel);
        turnLabel.setText("It is now " + player.get(0) + "'s turn");

        //buttons one through nine are the game buttons
        button1.setOnAction(actionEvent ->  {
            if(!Objects.equals(button1.getText(), "O") && !Objects.equals(button1.getText(), "X") && !gameOver){
                button1.setText(player.get(0));
                if(winCheck(button1, button2, button3) || winCheck(button1, button4, button7) || winCheck(button1, button5, button9)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){//checks for tie
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        button2.setOnAction(actionEvent ->  {
            if(!Objects.equals(button2.getText(), "O") && !Objects.equals(button2.getText(), "X") && !gameOver){
                button2.setText(player.get(0));
                if(winCheck(button1, button2, button3) || winCheck(button2, button5, button8)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        button3.setOnAction(actionEvent ->  {
            if(!Objects.equals(button3.getText(), "O") && !Objects.equals(button3.getText(), "X") && !gameOver){
                button3.setText(player.get(0));
                if(winCheck(button1, button2, button3) || winCheck(button3, button6, button9) || winCheck(button3, button5, button7)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        button4.setOnAction(actionEvent ->  {
            if(!Objects.equals(button4.getText(), "O") && !Objects.equals(button4.getText(), "X") && !gameOver){
                button4.setText(player.get(0));
                if(winCheck(button4, button5, button6) || winCheck(button4, button1, button7)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        button5.setOnAction(actionEvent ->  {
            if(!Objects.equals(button5.getText(), "O") && !Objects.equals(button5.getText(), "X") && !gameOver){
                button5.setText(player.get(0));
                if(winCheck(button4, button5, button6) || winCheck(button2, button5, button8)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        button6.setOnAction(actionEvent ->  {
            if(!Objects.equals(button6.getText(), "O") && !Objects.equals(button6.getText(), "X") && !gameOver){
                button6.setText(player.get(0));
                if(winCheck(button4, button5, button6) || winCheck(button6, button3, button9)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        button7.setOnAction(actionEvent ->  {
            if(!Objects.equals(button7.getText(), "O") && !Objects.equals(button7.getText(), "X") && !gameOver){
                button7.setText(player.get(0));
                if(winCheck(button7, button8, button9) || winCheck(button1, button4, button7) || winCheck(button7, button5, button3)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        button8.setOnAction(actionEvent ->  {
            if(!Objects.equals(button8.getText(), "O") && !Objects.equals(button8.getText(), "X") && !gameOver){
                button8.setText(player.get(0));
                if(winCheck(button7, button8, button9) || winCheck(button8, button5, button2)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        button9.setOnAction(actionEvent ->  {
            if(!Objects.equals(button9.getText(), "O") && !Objects.equals(button9.getText(), "X") && !gameOver){
                button9.setText(player.get(0));
                if(winCheck(button7, button8, button9) || winCheck(button3, button6, button9) || winCheck(button9, button5, button1)){
                    turnLabel.setText(player.get(0) + " is the winner!");
                    gameOver = true;
                }else if(check.size() == 8){
                    turnLabel.setText("Its a tie");
                }else{
                    turnLabel.setText("It is now " + player.get(1) + "'s turn");
                    Collections.swap(player, 0, 1);
                    check.add(true);
                }
            }
        });
        //button10 resets all buttons, all buttons have different spacing to not confuse winCheck
        button10.setOnAction(actionEvent -> {
            button1.setText("");
            button2.setText(" ");
            button3.setText("  ");
            button4.setText("   ");
            button5.setText("    ");
            button6.setText("     ");
            button7.setText("      ");
            button8.setText("       ");
            button9.setText("        ");
            turnLabel.setText("It is now " + player.get(0) + "'s turn");
            gameOver = false;
            check.clear();
        });
    }
    //checks to see if three buttons are equal to each other
    public static boolean winCheck(Button button1, Button button2, Button button3){
        return button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText());
    }

    public static void main(String[] args) {
        launch();
    }
}