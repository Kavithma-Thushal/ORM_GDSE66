package lk.ijse.gdse66.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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

    @FXML
    private void saveOnAction(ActionEvent actionEvent) {

    }

    @FXML
    private void searchOnAction(ActionEvent actionEvent) {

    }

    @FXML
    private void updateOnAction(ActionEvent actionEvent) {

    }

    @FXML
    private void deleteOnAction(ActionEvent actionEvent) {

    }

    @FXML
    private void backOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hibernate/view/dashboard_form.fxml"))));
    }
}
