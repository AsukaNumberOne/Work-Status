module com.example.work_status {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.work_status to javafx.fxml;
    exports com.example.work_status;
}