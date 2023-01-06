package com.zeeshan.resumemaker;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Path;

public class DeveloperEvent {
    FileChooser fileChooser;
    Image i;
    @FXML
    private ImageView imageView;
    @FXML
    private Label fnf,lnf,ff,pf,ef,af,pro,exp,ref,edu,lan,ski;
    @FXML
    private TextField firstname,lastname,field,phone,email,address;
    @FXML
    private TextArea profile,experience,reference,education,languages,skills;
    public void Newfile(ActionEvent e){
        Main m=new Main();
        try {
            m.developer("d.fxml");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public void ChoosePhoto(ActionEvent e){
        fileChooser=new FileChooser();
        fileChooser.setTitle("Choose Photo");

        File f=fileChooser.showOpenDialog(null);

        Path p=Path.of(String.valueOf(f));

        i=new Image(String.valueOf(p));
        imageView.setImage(i);

        System.out.println(p);
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

            com.itextpdf.text.Image imageRight = com.itextpdf.text.Image.getInstance("Data\\file.view.temp");
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
    public void Update(ActionEvent e){

        fnf.setText(firstname.getText());
        lnf.setText(lastname.getText());
        ff.setText(field.getText());
        pf.setText(phone.getText());
        ef.setText(email.getText());
        af.setText(address.getText());
        pro.setText(profile.getText());
        exp.setText(experience.getText());
        ref.setText(reference.getText());
        edu.setText(education.getText());
        lan.setText(languages.getText());
        ski.setText(skills.getText());
    }
    public void Exit(ActionEvent e){
        System.exit(0);
    }
}
