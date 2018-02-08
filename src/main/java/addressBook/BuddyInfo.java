package addressBook;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BuddyInfo {
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    private int id;
    private String name;
    private String number;

    public BuddyInfo(String name, String number){
        this.name = name;
        this.number= number;
    }

    public BuddyInfo(){}
    @Override
    public String toString() {
       return name + " " + number;
    }

    public boolean isEquals(BuddyInfo buddyInfo){
        return this.id == buddyInfo.getId() && this.number == buddyInfo.getNumber() && this.name == buddyInfo.getName();
    }


}
