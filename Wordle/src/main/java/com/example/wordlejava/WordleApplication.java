package com.example.wordlejava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;



public class WordleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WordleApplication.class.getResource("WordleView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        int width = 350;
        int height = 525;
        stage.setMaxWidth(width);
        stage.setMaxHeight(height);
        stage.setMinWidth(width);
        stage.setMinHeight(height);
        stage.setTitle("Wordle");
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}