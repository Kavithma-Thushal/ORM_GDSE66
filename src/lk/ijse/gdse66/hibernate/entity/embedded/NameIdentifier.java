package lk.ijse.gdse66.hibernate.entity.embedded;

import javax.persistence.Embeddable;

/**
 * @author : Kavithma Thushal
 * @project : ORM_GDSE66
 * @since : 6:02 PM - 8/6/2023
 **/
@Embeddable
public class NameIdentifier {

    private String firstName;
    private String middleName;
    private String lastName;

    public NameIdentifier() {
    }

    public NameIdentifier(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "NameIdentifier{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
