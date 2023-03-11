package com.barengific.ibj;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML private TextField txtDescription;
    @FXML private TextField txtQuantity;
    @FXML private TextField txtUPrice;
    @FXML private TextField txtVatPer;
    @FXML private TextField txtVATPrice;
    @FXML private TextField txtTotalPrice;


    @FXML private TableView<Item> tblItems;
    @FXML private TableColumn<Item, String> UserId;
    @FXML private TableColumn<Item, String> UserName;
    @FXML private TableColumn<Item, String> Active;


    @FXML private TableView<Term> tblTerms;
    @FXML private TableColumn<Term, Integer> tcNo;
    @FXML private TableColumn<Term, String> tcTerms;


    public static ObservableList<Term> olTerm = FXCollections.observableArrayList();

    @FXML
    protected void onAddItemBtn() {
//        welcomeText.setText("Welcome to JavaFX Application!");

        tblItems.setItems((ObservableList<Item>) new Item(txtDescription.getText(),txtQuantity.getText(),txtUPrice.getText(),
                txtVatPer.getText(),txtVATPrice.getText(),txtTotalPrice.getText()));


    }

    @FXML
    protected void onAddTermsBtn() {
        olTerm =
                FXCollections.observableArrayList(
                        new Term(new SimpleIntegerProperty(1), new SimpleStringProperty("Superman")),
                        new Term(new SimpleIntegerProperty(2), new SimpleStringProperty("batman")),
                        new Term(new SimpleIntegerProperty(3), new SimpleStringProperty("ironman")));

        tcNo.setCellValueFactory(new PropertyValueFactory<Term, Integer>("number"));
        tcTerms.setCellValueFactory(new PropertyValueFactory<Term, String>("description"));

        tblTerms.setItems(olTerm);

    }
}