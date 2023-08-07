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
import lk.ijse.gdse66.hibernate.entity.Customer;
import lk.ijse.gdse66.hibernate.repo.CustomerRepo;

import java.io.IOException;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 7:25 AM - 8/7/2023
 **/
public class CustomerFormControoler {

    @FXML
    private AnchorPane root;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtSalary;

    @FXML
    private void saveOnAction(ActionEvent actionEvent) {
        Customer customer = new Customer();
        customer.setId(Integer.parseInt(txtId.getText()));
        customer.setName(txtName.getText());
        customer.setAddress(txtAddress.getText());
        customer.setSalary(Double.parseDouble(txtSalary.getText()));

        CustomerRepo customerRepo = new CustomerRepo();
        boolean isSaved = customerRepo.saveCustomer(customer);
        if (isSaved == true) {
            new Alert(Alert.AlertType.INFORMATION, "Customer saved successfully!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Customer is not saved!").show();
        }
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
