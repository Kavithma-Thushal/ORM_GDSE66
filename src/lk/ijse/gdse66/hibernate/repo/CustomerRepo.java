package lk.ijse.gdse66.hibernate.repo;

import lk.ijse.gdse66.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse66.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 1:32 PM - 8/6/2023
 **/
public class CustomerRepo {

    public static boolean saveCustomer(Customer customer) {
        Session session = null;
        try {
            session = SessionFactoryConfig.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
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

    public static Customer searchCustomer() {
        Session session = null;
        try {
            session = SessionFactoryConfig.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
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

    public static boolean updateCustomer(Customer customer) {
        Session session = null;
        try {
            session = SessionFactoryConfig.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
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

    public static boolean deleteCustomer(Customer customer) {
        Session session = null;
        try {
            session = SessionFactoryConfig.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
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
