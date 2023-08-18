package lk.ijse.gdse66.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

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
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "item_code")
    private int itemCode;

    public Orders() {
    }

    public Orders(int orderId, int customerId, int itemCode) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.itemCode = itemCode;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", itemCode=" + itemCode +
                '}';
    }
}
