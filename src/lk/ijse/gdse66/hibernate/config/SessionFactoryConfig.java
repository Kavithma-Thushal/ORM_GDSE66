package lk.ijse.gdse66.hibernate.config;

import lk.ijse.gdse66.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 1:07 PM - 7/29/2023
 **/
public class SessionFactoryConfig {

    private static SessionFactoryConfig sessionFactoryConfig;

    private SessionFactoryConfig() {
    }

    public static SessionFactoryConfig getInstance() {
        /*if (sessionFactoryConfig == null) {
            return sessionFactoryConfig = new SessionFactoryConfig();
        }
        return sessionFactoryConfig;*/

        return (sessionFactoryConfig == null) ? sessionFactoryConfig = new SessionFactoryConfig() : sessionFactoryConfig;
    }

    public Session getSession() throws IOException {

        // Configuration object
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Customer.class);

        Properties properties = new Properties();
        properties.load(ClassLoader.getSystemResourceAsStream("hibernate.properties"));
        configuration.mergeProperties(properties);

        // Session Factory object
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Opens a new Session and Returns
        return sessionFactory.openSession();
    }
}
