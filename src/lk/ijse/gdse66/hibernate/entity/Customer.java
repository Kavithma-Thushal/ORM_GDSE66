package lk.ijse.gdse66.hibernate.entity;

import lk.ijse.gdse66.hibernate.entity.embedded.MobileNo;
import lk.ijse.gdse66.hibernate.entity.embedded.NameIdentifier;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 2:21 PM - 7/29/2023
 **/
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id")
    private int id;
    @Column(name = "cus_name")
    private String name;
    @Column(name = "cus_address")
    private String address;
    @Column(name = "cus_salary")
    private double salary;
    @Transient
    private String dob;
    @CreationTimestamp
    private Timestamp createdDataTime;
    private NameIdentifier nameIdentifier;
    @ElementCollection
    @CollectionTable(name = "cus_no", joinColumns = @JoinColumn(name = "cus_id"))
    private List<MobileNo> phoneNumbers = new ArrayList<>();

    public Customer() {
    }

    public Customer(int id, String name, String address, double salary, NameIdentifier nameIdentifier, List<MobileNo> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.nameIdentifier = nameIdentifier;
        this.phoneNumbers = phoneNumbers;
    }

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

    public NameIdentifier getNameIdentifier() {
        return nameIdentifier;
    }

    public void setNameIdentifier(NameIdentifier nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
    }

    public List<MobileNo> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<MobileNo> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", nameIdentifier=" + nameIdentifier +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
