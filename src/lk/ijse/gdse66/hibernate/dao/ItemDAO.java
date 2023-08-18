package lk.ijse.gdse66.hibernate.dao;

import lk.ijse.gdse66.hibernate.util.SessionFactoryConfiguration;
import lk.ijse.gdse66.hibernate.entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 8:04 PM - 8/7/2023
 **/
public class ItemDAO {
    private final Session session;
    private Transaction transaction;

    public ItemDAO() {
        session = SessionFactoryConfiguration.getInstance().getSession();
        transaction = session.beginTransaction();
    }

    public boolean saveItem(Item item) {
        try {
            session.save(item);
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

    public Item searchItem(int code) {
        try {
            Item item = session.get(Item.class, code);
            return item;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public boolean updateItem(Item item) {
        try {
            session.update(item);
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

    public boolean deleteItem(Item item) {
        try {
            session.delete(item);
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
