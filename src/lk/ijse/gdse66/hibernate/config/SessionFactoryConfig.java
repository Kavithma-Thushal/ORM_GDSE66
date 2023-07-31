package lk.ijse.gdse66.hibernate.config;

import lk.ijse.gdse66.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

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

    public Session getSession() {

        // Creates a Service Registry
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        // Creates a Metadata Object
        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        // Creates the Session Factory
        SessionFactory sessionFactory = metadata.buildSessionFactory();

        // Opens a new Session and Returns
        return sessionFactory.openSession();
    }
}
