package lk.ijse.gdse66.hibernate.entity.Embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 4:42 PM - 8/18/2023
 **/
@Embeddable
public class OrderDetailsPrimaryKey implements Serializable {
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "item_code")
    private int ItemCode;

    public OrderDetailsPrimaryKey() {
    }

    public OrderDetailsPrimaryKey(int orderId, int itemCode) {
        this.orderId = orderId;
        ItemCode = itemCode;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemCode() {
        return ItemCode;
    }

    public void setItemCode(int itemCode) {
        ItemCode = itemCode;
    }
}
