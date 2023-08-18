package lk.ijse.gdse66.hibernate.entity;

import lk.ijse.gdse66.hibernate.entity.Embedded.OrderDetailsPrimaryKey;

import javax.persistence.*;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 4:24 PM - 8/18/2023
 **/
@Entity
@Table(name = "order_details")
public class OrderDetails {
    @EmbeddedId
    private OrderDetailsPrimaryKey orderDetailsPrimaryKey;
    @Column(name = "quantity")
    private int qty;
    @Column(name = "total")
    private double total;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Orders orders;
    @ManyToOne
    @JoinColumn(name = "item_code", insertable = false, updatable = false)
    private Item item;

    public OrderDetails() {
    }

    public OrderDetails(int qty, double total) {
        this.qty = qty;
        this.total = total;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
