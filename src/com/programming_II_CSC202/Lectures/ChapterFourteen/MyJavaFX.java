package com.programming_II_CSC202.Lectures.ChapterFourteen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

    @Override
    public void start(Stage stage){ //throws Exception {
        Button OKBtn = new Button("OK");
        Scene scene = new Scene(OKBtn,200,200);
        stage.setTitle("MyJavaFX"); // Set the stage title
        stage.setScene(scene);
        stage.show();

        Stage stage2 = new Stage(); // Create a new stage
        stage2.setTitle("Second Stage"); // Set the stage title
        // Set a scene with a button in the stage
        stage2.setScene(new Scene(new Button("New Stage"), 200, 250));
        stage2.show(); // Display the stage

        //     throw new UnsupportedOperationException("Not supported yet.");
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody



    }

    public static void main ( String [] args){
        launch(args);
    }
}