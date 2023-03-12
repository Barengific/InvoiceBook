module com.barengific.ibj {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires itextpdf;

//    requires com.itextpdf;
//
//    requires org.apache.pdfbox;

    opens com.barengific.ibj to javafx.fxml;
    exports com.barengific.ibj;
}