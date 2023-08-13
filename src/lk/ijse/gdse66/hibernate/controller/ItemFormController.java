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
    private ItemDAO itemDAO;

    @FXML
    private void saveOnAction(ActionEvent actionEvent) {
        Item item = new Item();
        item.setCode(Integer.parseInt(txtCode.getText()));
        item.setDescription(txtDescription.getText());
        item.setUnitPrice(Double.parseDouble(txtUnitPrice.getText()));
        item.setQuantityOnHand(Integer.parseInt(txtQtyOnHand.getText()));

        itemDAO = new ItemDAO();
        boolean isSaved = itemDAO.saveItem(item);
        if (isSaved == true) {
            new Alert(Alert.AlertType.INFORMATION, "Item saved successfully!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Try Again!").show();
        }
    }

    @FXML
    private void searchOnAction(ActionEvent actionEvent) {
        itemDAO = new ItemDAO();
        Item searchedItem = itemDAO.searchItem(Integer.parseInt(txtCode.getText()));
        if (searchedItem != null) {
            txtDescription.setText(String.valueOf(searchedItem.getDescription()));
            txtUnitPrice.setText(String.valueOf(searchedItem.getUnitPrice()));
            txtQtyOnHand.setText(String.valueOf(searchedItem.getQuantityOnHand()));
        } else {
            new Alert(Alert.AlertType.ERROR, "Try Again!").show();
        }
    }

    @FXML
    private void updateOnAction(ActionEvent actionEvent) {
        Item item = new Item();
        item.setCode(Integer.parseInt(txtCode.getText()));
        item.setDescription(txtDescription.getText());
        item.setUnitPrice(Double.parseDouble(txtUnitPrice.getText()));
        item.setQuantityOnHand(Integer.parseInt(txtQtyOnHand.getText()));

        itemDAO = new ItemDAO();
        boolean isUpdated = itemDAO.updateItem(item);
        if (isUpdated == true) {
            new Alert(Alert.AlertType.INFORMATION, "Item updated successfully!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Try Again!").show();
        }
    }

    @FXML
    private void deleteOnAction(ActionEvent actionEvent) {
        Item item = new Item();
        item.setCode(Integer.parseInt(txtCode.getText()));

        itemDAO = new ItemDAO();
        boolean isDeleted = itemDAO.deleteItem(item);
        if (isDeleted == true) {
            new Alert(Alert.AlertType.INFORMATION, "Item deleted successfully!").show();
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
