package lk.ijse.gdse66.hibernate;

import lk.ijse.gdse66.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse66.hibernate.entity.Customer;
import lk.ijse.gdse66.hibernate.repo.CustomerRepo;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 10:14 AM - 7/29/2023
 **/
public class AppInitializer {
    public static void main(String[] args) throws IOException {
        Customer customer = getCustomer();

        boolean isSaved = CustomerRepo.saveCustomer(customer);
        if(isSaved==true){
            System.out.println("Customer saved successfully!");
        }else {
            System.out.println("Customer is not saved!");
        }
    }

    private static Customer getCustomer() {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("Thushal");
        customer.setAddress("Galle");
        customer.setSalary(12000);
        return customer;
    }
}
