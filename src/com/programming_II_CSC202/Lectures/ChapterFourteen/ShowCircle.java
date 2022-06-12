package com.programming_II_CSC202.Lectures.ChapterFourteen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

    @Override
    public void start(Stage stage)  {
        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(75);
        circle.setStroke(Color.BLACK); // Set circle stroke color
        circle.setFill(Color.RED);

        Circle circle2 = new Circle();
        circle2.setCenterX(200);
        circle2.setCenterY(300);
        circle2.setRadius(75);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.YELLOW);



        // Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(circle2);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 500, 800);
        stage.setTitle("ShowCircle"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage

    }

    public static void main(String [] args){
        launch(args);
    }

}