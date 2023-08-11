package lk.ijse.gdse66.hibernate.config;

import lk.ijse.gdse66.hibernate.entity.Customer;
import lk.ijse.gdse66.hibernate.entity.Item;
import lk.ijse.gdse66.hibernate.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 1:07 PM - 7/29/2023
 **/
public class SessionFactoryConfig {

    private static SessionFactoryConfig sessionFactoryConfig;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Orders.class)
                .configure().buildSessionFactory();
    }

    public static SessionFactoryConfig getInstance() {
        return (sessionFactoryConfig == null) ? sessionFactoryConfig = new SessionFactoryConfig() : sessionFactoryConfig;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
