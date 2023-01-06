package com.zeeshan.resumemaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {
    public void simple(String s)throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(s));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Simple Resume");
        FileInputStream i=new FileInputStream("Data\\file.view.logo");
        stage.getIcons().add(new Image(i));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public void intermediate(String s)throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(s));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Intermediate Resume");
        FileInputStream i=new FileInputStream("Data\\file.view.logo");
        stage.getIcons().add(new Image(i));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public void advanced(String s)throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(s));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Advanced Resume");
        FileInputStream i=new FileInputStream("Data\\file.view.logo");
        stage.getIcons().add(new Image(i));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public void developer(String s)throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(s));
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Developer Resume");
        FileInputStream i=new FileInputStream("Data\\file.view.logo");
        stage.getIcons().add(new Image(i));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("theme.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Resume Maker");
        FileInputStream i=new FileInputStream("Data\\file.view.logo");
        stage.getIcons().add(new Image(i));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}