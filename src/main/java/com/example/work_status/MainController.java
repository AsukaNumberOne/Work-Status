package com.example.work_status;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> employeesList;

    @FXML
    private Button foundButton;

    @FXML
    private TextField search;

    @FXML
    private TextField search1;

    @FXML
    void initialize() {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        employeesList.getItems().setAll(
                        "Грузчики",
                        "Водители",
                        "Сортировщики");
    }

    public void employeeListMethod(ActionEvent actionEvent) {
        String changed = employeesList.getSelectionModel().getSelectedItem();
        System.out.println(changed);
    }
}