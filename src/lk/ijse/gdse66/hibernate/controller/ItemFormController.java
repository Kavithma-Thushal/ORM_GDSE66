package lk.ijse.gdse66.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.gdse66.hibernate.entity.Item;
import lk.ijse.gdse66.hibernate.dao.ItemDAO;

import java.io.IOException;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 7:25 AM - 8/7/2023
 **/
public class ItemFormController {

    @FXML
    private AnchorPane root;
    @FXML
    private TextField txtCode;
    @FXML
    private TextField txtDescription;
    @FXML
    private TextField txtUnitPrice;
    @FXML
    private TextField txtQtyOnHand;
    private Item item = new Item();
    private ItemDAO itemDAO;

    @FXML
    private void saveOnAction(ActionEvent actionEvent) {
        item.setCode(Integer.parseInt(txtCode.getText()));
        item.setDescription(txtDescription.getText());
        item.setUnitPrice(Double.parseDouble(txtUnitPrice.getText()));
        item.setQtyOnHand(Integer.parseInt(txtQtyOnHand.getText()));

        itemDAO = new ItemDAO();
        boolean isSaved = itemDAO.saveItem(item);
        if (isSaved == true) {
            new Alert(Alert.AlertType.INFORMATION, "Item Saved Successfully!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Try Again!").show();
        }
    }

    @FXML
    private void searchOnAction(ActionEvent actionEvent) {
        itemDAO = new ItemDAO();
        Item isSearched = itemDAO.searchItem(Integer.parseInt(txtCode.getText()));
        if (isSearched != null) {
            txtDescription.setText(String.valueOf(isSearched.getDescription()));
            txtUnitPrice.setText(String.valueOf(isSearched.getUnitPrice()));
            txtQtyOnHand.setText(String.valueOf(isSearched.getQtyOnHand()));
        } else {
            new Alert(Alert.AlertType.ERROR, "Try Again!").show();
        }
    }

    @FXML
    private void updateOnAction(ActionEvent actionEvent) {
        item.setCode(Integer.parseInt(txtCode.getText()));
        item.setDescription(txtDescription.getText());
        item.setUnitPrice(Double.parseDouble(txtUnitPrice.getText()));
        item.setQtyOnHand(Integer.parseInt(txtQtyOnHand.getText()));

        itemDAO = new ItemDAO();
        boolean isUpdated = itemDAO.updateItem(item);
        if (isUpdated == true) {
            new Alert(Alert.AlertType.INFORMATION, "Item Updated Successfully!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Try Again!").show();
        }
    }

    @FXML
    private void deleteOnAction(ActionEvent actionEvent) {
        item.setCode(Integer.parseInt(txtCode.getText()));

        itemDAO = new ItemDAO();
        boolean isDeleted = itemDAO.deleteItem(item);
        if (isDeleted == true) {
            new Alert(Alert.AlertType.INFORMATION, "Item Deleted Successfully!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Try Again!").show();
        }
    }

    @FXML
    private void backOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hibernate/view/dashboard_form.fxml"))));
    }
}
