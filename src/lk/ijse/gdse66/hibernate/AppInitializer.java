package lk.ijse.gdse66.hibernate;

import lk.ijse.gdse66.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse66.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 10:14 AM - 7/29/2023
 **/
public class AppInitializer {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Thushal");
        customer.setAddress("Galle");
        customer.setSalary(25000.00);

        //Save
        Session saveSession = SessionFactoryConfig.getInstance().getSession();
        Transaction saveTransaction = saveSession.beginTransaction();
        saveSession.save(customer);     //persists (saves) customer object in DB
        saveTransaction.commit();
        saveSession.close();

        //Update
        Session updateSession = SessionFactoryConfig.getInstance().getSession();
        Transaction updateTransaction = updateSession.beginTransaction();
        updateSession.update(customer);
        updateTransaction.commit();
        updateSession.close();

        //Delete
        Session deleteSession = SessionFactoryConfig.getInstance().getSession();
        Transaction deleteTransaction = deleteSession.beginTransaction();
        Customer deleteCustomer = deleteSession.get(Customer.class, 1);
        deleteSession.delete(deleteCustomer);       //deletes a Customer from DB
        deleteTransaction.commit();
        deleteSession.close();

        /*//Get
        Session updateSession = SessionFactoryConfig.getInstance().getSession();
        Transaction updateTransaction = updateSession.beginTransaction();
        Customer updateCustomer = updateSession.get(Customer.class, 1); // Retrieves (Get) customer data from DB by ID
        updateCustomer.setName("Namal");
        updateCustomer.setAddress("Hambantota");
        //updateSession.save(customer1);    //you can use this to update an already existing data in DB
        updateSession.update(updateCustomer);    //or you can use this to update an already existing data in DB
        updateTransaction.commit();
        updateSession.close();*/
    }
}
