package lk.ijse.gdse66.hibernate.dao;

import lk.ijse.gdse66.hibernate.util.SessionFactoryConfiguration;
import lk.ijse.gdse66.hibernate.entity.Orders;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 5:09 PM - 8/8/2023
 **/
public class OrdersDAO {
    private final Session session;
    private Transaction transaction;

    public OrdersDAO() {
        session = SessionFactoryConfiguration.getInstance().getSession();
        transaction = session.beginTransaction();
    }

    public boolean placeOrder(Orders orders) {
        try {
            session.save(orders);
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
