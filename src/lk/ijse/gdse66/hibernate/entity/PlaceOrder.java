package lk.ijse.gdse66.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 5:12 PM - 8/8/2023
 **/
@Entity
public class PlaceOrder {
    @Id
    private int orderId;
    @CreationTimestamp
    private Timestamp orderDate;
    private int customerId;
    private int itemCode;

    public PlaceOrder() {
    }

    public PlaceOrder(int orderId, int customerId, int itemCode) {
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
        return "PlaceOrder{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", itemCode=" + itemCode +
                '}';
    }
}
