package lk.ijse.gdse66.hibernate.config;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 1:07 PM - 7/29/2023
 **/
public class SessionFactoryConfig {

    private static SessionFactoryConfig sessionFactoryConfig;

    private SessionFactoryConfig() {
    }

    public static SessionFactoryConfig getSessionFactoryConfig() {
        /*if (sessionFactoryConfig == null) {
            return sessionFactoryConfig = new SessionFactoryConfig();
        }
        return sessionFactoryConfig;*/

        return (sessionFactoryConfig == null) ? sessionFactoryConfig = new SessionFactoryConfig() : sessionFactoryConfig;
    }
}
