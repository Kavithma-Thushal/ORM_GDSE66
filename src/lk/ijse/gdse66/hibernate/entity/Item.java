package lk.ijse.gdse66.hibernate.entity;

import javax.persistence.*;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 7:56 PM - 8/7/2023
 **/
@Entity(name = "item")
public class Item {
    @Id
    @Column(name = "item_code")
    private int code;
    @Column(name = "item_description")
    private String description;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "qty_on_hand")
    private int quantityOnHand;

    public Item() {
    }

    public Item(int code, String description, double unitPrice, int quantityOnHand) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantityOnHand = quantityOnHand;
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

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", quatityOnHand=" + quantityOnHand +
                '}';
    }
}
