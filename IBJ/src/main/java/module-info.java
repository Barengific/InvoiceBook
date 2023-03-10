module com.barengific.ibj {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    opens com.barengific.ibj to javafx.fxml;
    exports com.barengific.ibj;
}