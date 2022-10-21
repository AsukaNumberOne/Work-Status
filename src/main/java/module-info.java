module com.example.work_status {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.work_status to javafx.fxml;
    exports com.example.work_status;
}