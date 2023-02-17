module com.tienvung.test {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tienvung.test to javafx.fxml;
    exports com.tienvung.test;
}
