package lk.ijse.gdse66.hibernate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.gdse66.hibernate.entity.Customer;
import lk.ijse.gdse66.hibernate.entity.embedded.MobileNo;
import lk.ijse.gdse66.hibernate.entity.embedded.NameIdentifier;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 10:14 AM - 7/29/2023
 **/
public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);

        //Customer customer = getCustomer();
        //CustomerRepo customerRepo = new CustomerRepo();

        /*boolean isSaved = customerRepo.saveCustomer(customer);
        if (isSaved == true) {
            System.out.println("Customer saved successfully!");
        } else {
            System.out.println("Customer is not saved!");
        }*/

        /*Customer searchedCustomer = customerRepo.searchCustomer();
        if (searchedCustomer != null) {
            System.out.println(searchedCustomer);
            System.out.println("Customer searched successfully!");
        } else {
            System.out.println("Customer is not searched!");
        }*/

        /*boolean isUpdated = customerRepo.updateCustomer(customer);
        if(isUpdated==true){
            System.out.println("Customer updated successfully!");
        }else {
            System.out.println("Customer is not updated!");
        }*/

        /*boolean isDeleted = customerRepo.deleteCustomer(customer);
        if (isDeleted == true) {
            System.out.println("Customer deleted successfully!");
        } else {
            System.out.println("Customer is not deleted!");
        }*/
    }

    private static Customer getCustomer() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Thushal");
        customer.setAddress("Galle");
        customer.setSalary(12000);

        //extracted(customer);
        //extracted1(customer);
        return customer;
    }

    private static void extracted(Customer customer) {
        NameIdentifier nameIdentifier = new NameIdentifier();
        nameIdentifier.setFirstName("Meepe Gamage Don");
        nameIdentifier.setMiddleName("Kavithma");
        nameIdentifier.setLastName("Thushal");
        customer.setNameIdentifier(nameIdentifier);
    }

    private static void extracted1(Customer customer) {
        List<MobileNo> mobileNos = new ArrayList<>();
        MobileNo mobileNo1 = new MobileNo("Home", "0912232212");
        mobileNos.add(mobileNo1);
        customer.setPhoneNumbers(mobileNos);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/gdse66/hibernate/view/dashboard_form.fxml"))));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
