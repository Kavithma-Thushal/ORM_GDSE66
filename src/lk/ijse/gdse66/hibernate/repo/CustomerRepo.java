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

    public static boolean saveCustomer(Customer customer) throws IOException {
        Session session = SessionFactoryConfig.getInstance().getSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
            return false;
        }
    }
}
