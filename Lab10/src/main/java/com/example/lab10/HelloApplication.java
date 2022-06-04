package com.example.lab10;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    //Task 1
    TextField Fname = new TextField();
    TextField id = new TextField();
    TextField nameAndId = new TextField();
    Button btEnter = new Button("Enter");

    @Override
    public void start(Stage stage) throws IOException {

        //Task 2 - UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Enter your name"), 0, 0);
        gridPane.add(new Label("Enter your id"), 0, 1);
        gridPane.add(new Label("Hi :)"), 0, 2);
        gridPane.add(Fname, 1, 0);
        gridPane.add(id, 1, 1);
        gridPane.add(nameAndId, 1, 2);
        gridPane.add(btEnter, 1, 3);

        //Task 3
        gridPane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(btEnter, HPos.RIGHT);

        //Task 4
        // onClick Function
        btEnter.setOnAction(e -> {
            nameAndId.setText((Fname.getText()) + (id.getText()));
        });

        //Task 5
        Scene scene = new Scene(gridPane, 400, 250);
        stage.setTitle("Moutasim El Ayoubi");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}