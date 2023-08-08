package lk.ijse.gdse66.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 7:01 AM - 8/7/2023
 **/
public class DashboardFormController {

    @FXML
    private AnchorPane root;

    @FXML
    private void customerOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hibernate/view/customer_form.fxml"))));
    }

    @FXML
    private void itemOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hibernate/view/Item_form.fxml"))));
    }

    @FXML
    private void placeOrdersOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hibernate/view/placeOrders_form.fxml"))));
    }
}
