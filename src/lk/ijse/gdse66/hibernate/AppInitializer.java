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
        saveSession.save(customer);
        saveTransaction.commit();
        saveSession.close();

    }
}
