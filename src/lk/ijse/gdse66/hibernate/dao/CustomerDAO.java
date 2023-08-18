package lk.ijse.gdse66.hibernate.dao;

import lk.ijse.gdse66.hibernate.util.SessionFactoryConfiguration;
import lk.ijse.gdse66.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 1:32 PM - 8/6/2023
 **/
public class CustomerDAO {
    private final Session session;
    private Transaction transaction;

    public CustomerDAO() {
        session = SessionFactoryConfiguration.getInstance().getSession();
        transaction = session.beginTransaction();
    }

    public boolean saveCustomer(Customer customer) {
        try {
            session.save(customer);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public Customer searchCustomer(int id) {
        try {
            Customer customer = session.get(Customer.class, id);
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public boolean updateCustomer(Customer customer) {
        try {
            session.update(customer);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean deleteCustomer(Customer customer) {
        try {
            session.delete(customer);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        } finally {
            session.close();
        }
    }
}
