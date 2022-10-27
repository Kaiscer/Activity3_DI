module com.github.kaiscer.activity3_di {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.kaiscer.activity3_di to javafx.fxml;
    exports com.github.kaiscer.activity3_di;
}