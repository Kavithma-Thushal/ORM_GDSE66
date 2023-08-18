package lk.ijse.gdse66.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 5:12 PM - 8/8/2023
 **/
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @CreationTimestamp
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToMany
    private List<Item> itemList = new ArrayList<>();

    public Orders() {
    }

    public Orders(int orderId, int customerId, int itemCode) {
        this.orderId = orderId;
        //this.customerId = customerId;
        //this.itemCode = itemCode;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /*public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }*/

    /*public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }*/

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                //", customerId=" + customerId +
                //", itemCode=" + itemCode +
                '}';
    }
}
