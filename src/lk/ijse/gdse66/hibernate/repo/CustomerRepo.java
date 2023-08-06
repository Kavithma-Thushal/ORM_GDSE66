package lk.ijse.gdse66.hibernate.repo;

import lk.ijse.gdse66.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse66.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 1:32 PM - 8/6/2023
 **/
public class CustomerRepo {

    private final Session session;
    private Transaction transaction;

    public CustomerRepo() throws IOException {
        session = SessionFactoryConfig.getInstance().getSession();
        transaction = session.beginTransaction();
    }

    public boolean saveCustomer(Customer customer) {
        try {
            session.save(customer);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.close();
            return false;
        }
    }

    public Customer searchCustomer() {
        try {
            Customer customer = session.get(Customer.class, 1);
            transaction.commit();
            session.close();
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
            session.close();
            return null;
        }
    }

    public boolean updateCustomer(Customer customer) {
        try {
            session.update(customer);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.close();
            return false;
        }
    }

    public boolean deleteCustomer(Customer customer) {
        try {
            session.delete(customer);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.close();
            return false;
        }
    }
}
