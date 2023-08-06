package lk.ijse.gdse66.hibernate;

import lk.ijse.gdse66.hibernate.entity.Customer;
import lk.ijse.gdse66.hibernate.repo.CustomerRepo;

import java.io.IOException;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 10:14 AM - 7/29/2023
 **/
public class AppInitializer {
    public static void main(String[] args) throws IOException {
        Customer customer = getCustomer();
        CustomerRepo customerRepo = new CustomerRepo();

        /*boolean isSaved = customerRepo.saveCustomer(customer);
        if(isSaved==true){
            System.out.println("Customer saved successfully!");
        }else {
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
        customer.setId(4);
        customer.setName("Pathum");
        customer.setAddress("Galle");
        customer.setSalary(12000);
        return customer;
    }
}
