module com.example.tringraph {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tringraph to javafx.fxml;
    exports com.example.tringraph;
}