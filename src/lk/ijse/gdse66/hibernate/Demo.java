/*
package lk.ijse.gdse66.hibernate;

import lk.ijse.gdse66.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse66.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

*/
/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 7:08 AM - 7/30/2023
 **//*

public class Demo {
    public static void main(String[] args) {

        */
/*Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Yasas");
        customer.setAddress("Galle");
        customer.setSalary(500.00);

        //save
        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();*//*


        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //get
        Customer customer1 = session.get(Customer.class, 1);
        customer1.setName("Yasas Daraka");
        customer1.setAddress("Galle");
        customer1.setSalary(500.00);
        session.save(customer1);
        session.update(customer1);
        transaction.commit();
        session.close();

        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer1 = session.get(Customer.class, 1);
        session.delete(customer1);
        transaction.commit();
        session.close();
    }
}
*/
