package lk.ijse.gdse66.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 7:56 PM - 8/7/2023
 **/
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private int code;
    @Column(name = "description")
    private String description;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "quantity_on_hand")
    private int qtyOnHand;

    /*@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "itemList")
    private List<Orders> ordersList = new ArrayList<>();*/

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetails> orderDetailsList = new ArrayList<>();

    public Item() {
    }

    public Item(int code, String description, double unitPrice, int qtyOnHand) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
}
