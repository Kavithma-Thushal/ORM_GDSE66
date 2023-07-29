package lk.ijse.gdse66.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 2:21 PM - 7/29/2023
 **/
@Entity
@Table(name = "customer")
public class Customer {

    public Customer() {
    }

    public Customer(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Id
    @Column(name = "cusId")
    private int id;
    @Column(name = "cusName")
    private String name;
    @Column(name = "cusAddress")
    private String address;
    @Column(name = "cusSalary")
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
