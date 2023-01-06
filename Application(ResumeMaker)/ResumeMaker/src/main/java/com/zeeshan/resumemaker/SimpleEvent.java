package com.zeeshan.resumemaker;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Path;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

public class SimpleEvent {
    FileChooser fileChooser;
    @FXML
    private AnchorPane panel;
    @FXML
    private Label name,field,phone,email,website,aboutme,skills,projects,education,experience,languages,hobby;
    @FXML
    private TextField fnf,ff,pnf,emf,wf;
    @FXML
    private TextArea aboa,skia,proa,edua,expa,lana,hoba;
    public void Update(ActionEvent e){
        name.setText(fnf.getText());
        field.setText(ff.getText());
        phone.setText(pnf.getText());
        email.setText(emf.getText());
        website.setText(wf.getText());
        aboutme.setText(aboa.getText());
        skills.setText(skia.getText());
        projects.setText(proa.getText());
        education.setText(edua.getText());
        experience.setText(expa.getText());
        languages.setText(lana.getText());
        hobby.setText(hoba.getText());
    }
    public void Newfile(ActionEvent e){
        Main m=new Main();
        try {
            m.simple("s.fxml");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public void PDFsave(ActionEvent e){

        fileChooser=new FileChooser();
        fileChooser.setTitle("Save PDF");

        File file=fileChooser.showSaveDialog(null);

        Path path=Path.of(String.valueOf(file));

        System.out.println(path);
        Click s=new Click();

        // * * * * * * * * * *

        Document document=new Document(PageSize.B4, 0, 0, 50, 0);
        try {
            PdfWriter.getInstance(document, new FileOutputStream(path+".pdf"));
            document.open();

            Image imageRight = Image.getInstance("Data\\file.view.temp");
            imageRight.setAlignment(imageRight.ALIGN_CENTER);

            document.add(imageRight);

            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText(null);
            a.setContentText("Your PDF has been created...!");
            a.setTitle("PDF Created...!");
            a.show();
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        document.close();
    }
    public void Exit(ActionEvent e){
        System.exit(0);
    }
}
