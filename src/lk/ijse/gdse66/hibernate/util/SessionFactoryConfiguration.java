package lk.ijse.gdse66.hibernate.util;

import lk.ijse.gdse66.hibernate.entity.Customer;
import lk.ijse.gdse66.hibernate.entity.Item;
import lk.ijse.gdse66.hibernate.entity.OrderDetails;
import lk.ijse.gdse66.hibernate.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 1:07 PM - 7/29/2023
 **/
public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfiguration() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Orders.class)
                .addAnnotatedClass(OrderDetails.class)
                .configure("lk/ijse/gdse66/hibernate/util/hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public static SessionFactoryConfiguration getInstance() {
        return (sessionFactoryConfiguration == null) ? sessionFactoryConfiguration = new SessionFactoryConfiguration() : sessionFactoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
