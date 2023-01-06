module com.zeeshan.resummaker {
    requires javafx.controls;
    requires javafx.fxml;
    requires itextpdf;
    requires java.desktop;


    opens com.zeeshan.resumemaker to javafx.fxml;
    exports com.zeeshan.resumemaker;
}