package com.barengific.ibj;

import com.itextpdf.text.*;
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


import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class HelloController {

    @FXML private TextField txtDescription;
    @FXML private TextField txtQuantity;
    @FXML private TextField txtUPrice;
    @FXML private TextField txtVatPer;
    @FXML private TextField txtVATPrice;
    @FXML private TextField txtTotalPrice;


    @FXML private TableView<Item> tblItems;
    @FXML private TableColumn<Item, String> tcDescription;
    @FXML private TableColumn<Item, String> tcQuantity;
    @FXML private TableColumn<Item, String> tcUPrice;
    @FXML private TableColumn<Item, String> tcVatPer;
    @FXML private TableColumn<Item, String> tcVatPrice;
    @FXML private TableColumn<Item, String> tcTPrice;


    @FXML private TableView<Term> tblTerms;
    @FXML private TableColumn<Term, Integer> tcNo;
    @FXML private TableColumn<Term, String> tcTerms;

    @FXML private TextField txtTC;
    private int txtTcNo = 1;


    public static ObservableList<Term> olTerm = FXCollections.observableArrayList();
    public static ObservableList<Item> olItem = FXCollections.observableArrayList();

    @FXML
    protected void onAddItemBtn() {
//        welcomeText.setText("Welcome to JavaFX Application!");

        olItem.add(new Item(txtDescription.getText(), txtQuantity.getText(), txtUPrice.getText(),
                txtVatPer.getText(),txtVATPrice.getText(), txtTotalPrice.getText()  ));

        tcDescription.setCellValueFactory(new PropertyValueFactory<Item, String>("description")); ;
        tcQuantity.setCellValueFactory(new PropertyValueFactory<Item, String>("quantity"));
        tcUPrice.setCellValueFactory(new PropertyValueFactory<Item, String>("unitPrice"));
        tcVatPer.setCellValueFactory(new PropertyValueFactory<Item, String>("vatPer"));
        tcVatPrice.setCellValueFactory(new PropertyValueFactory<Item, String>("vatPrice"));
        tcTPrice.setCellValueFactory(new PropertyValueFactory<Item, String>("totalPrice"));

        tblItems.setItems(olItem);


    }

    @FXML
    protected void onAddTermsBtn() {
//        olTerm =
//                FXCollections.observableArrayList(
//                        new Term(new SimpleIntegerProperty(1), new SimpleStringProperty(txtTC.getText())));

        olTerm.add(new Term(new SimpleIntegerProperty(txtTcNo), new SimpleStringProperty(txtTC.getText())));
        txtTcNo = txtTcNo + 1;
        tcNo.setCellValueFactory(new PropertyValueFactory<Term, Integer>("number"));
        tcTerms.setCellValueFactory(new PropertyValueFactory<Term, String>("description"));
        tblTerms.setItems(olTerm);

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));

            document.open();
            Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
            Chunk chunk = new Chunk("Hello World", font);

            document.add(chunk);
            document.close();



        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}