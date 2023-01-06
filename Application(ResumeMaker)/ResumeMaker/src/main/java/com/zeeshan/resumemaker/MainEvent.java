package com.zeeshan.resumemaker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainEvent implements Initializable {
    @FXML
    private ImageView s,i,a,d;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Main m=new Main();
        s.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    m.simple("s.fxml");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        i.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    m.intermediate("i.fxml");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        a.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    m.advanced("a.fxml");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });;
        d.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    m.developer("d.fxml");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void Simple(ActionEvent e){
        Main m=new Main();
        try {
            m.simple("s.fxml");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Intermediate(ActionEvent e){
        Main m=new Main();
        try {
            m.simple("i.fxml");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Advanced(ActionEvent e){
        Main m=new Main();
        try {
            m.simple("a.fxml");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Developer(ActionEvent e){
        Main m=new Main();
        try {
            m.simple("d.fxml");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Exit(ActionEvent e){
        System.exit(0);
    }
}