/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Bid;

import Entities.Bid;
import Services.Implementation.BidService;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 * FXML Controller class
 *
 * @author asus
 */
public class BidController implements Initializable {

    @FXML
    private TableView<Bid> bidsTable;
    @FXML
    private TableColumn<Bid, String> ProjectNameColumn;
    @FXML
    private TableColumn<Bid, String> MinimalRateColumn;
    @FXML
    private TableColumn<Bid, Date> DeliveryTimeColumn;

    BidService bidService = BidService.getInstance();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //set up the columns in the table
        ProjectNameColumn.setCellValueFactory(new PropertyValueFactory<Bid, String>("ProjectNameColumn"));
        MinimalRateColumn.setCellValueFactory(new PropertyValueFactory<Bid, String>("MinimalRateColumn"));
        DeliveryTimeColumn.setCellValueFactory(new PropertyValueFactory<Bid, Date>("DeliveryTimeColumn"));

        //load dummy data
        bidsTable.setItems(getBidList());

        //Update the table to allow for the first and last name fields
        //to be editable
        

        //This will allow the table to select multiple rows at once
        bidsTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //Disable the detailed person view button until a row is selected
        //this.detailedPersonViewButton.setDisable(true); 
    }

    public ObservableList<Bid> getBidList() {
        ObservableList<Bid> bids = FXCollections.observableArrayList();
        ArrayList<Bid> bid = new ArrayList<>();
        bids.addAll(bid);
        return bids;

    }

}
