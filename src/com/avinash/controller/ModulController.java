package com.avinash.controller;

import com.avinash.entity.Food;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ModulController implements Initializable {
    public TextField nama;
    public TextField harga;
    public TextField categoryname;
    public TableView<Food> table;
    private ObservableList<Food> food;
    public TableColumn col1;
    public TableColumn col2;
    public TableColumn col3;

    public void savecategoryaction(ActionEvent actionEvent) {
    }

    public void saveaction(ActionEvent actionEvent) {

    }

    public void updateaction(ActionEvent actionEvent) {
    }

    public void resetaction(ActionEvent actionEvent) {
    }

    public void tableClicked(MouseEvent mouseEvent) {/**
     fakultas f=tabledepartment.getSelectionMode().getSelectedItem();
     txtName.setText(f.getNama());**/
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        food = FXCollections.observableArrayList();
        table.setItems(food);
        col1.setCellValueFactory(data -> {
            Food f = data.getValue();
            return new SimpleStringProperty(f.getNama());
        });

    }
}
