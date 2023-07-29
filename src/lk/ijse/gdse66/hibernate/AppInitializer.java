package lk.ijse.gdse66.hibernate;

import lk.ijse.gdse66.hibernate.config.SessionFactoryConfig;
import org.hibernate.Session;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 10:14 AM - 7/29/2023
 **/
public class AppInitializer {
    public static void main(String[] args) {
        Session session= SessionFactoryConfig.getInstance().getSession();

    }
}
