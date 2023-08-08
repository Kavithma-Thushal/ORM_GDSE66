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
 * @since : 7:26 AM - 8/7/2023
 **/
public class PlaceOrdersFormController {

    @FXML
    private AnchorPane root;
    @FXML
    private TextField txtOrderId;
    @FXML
    private TextField txtOrderDate;
    @FXML
    private TextField txtCustomerId;
    @FXML
    private TextField txtItemCode;
    @FXML
    private TextField txtQty;
    @FXML
    private TextField txtUnitPrice;

    @FXML
    private void backOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hibernate/view/dashboard_form.fxml"))));
    }

    @FXML
    private void placeOrderOnAction(ActionEvent actionEvent) {

    }
}
