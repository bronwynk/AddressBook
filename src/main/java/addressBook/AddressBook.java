package addressBook;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    public void setBook(List<addressBook.BuddyInfo> book) {
        this.book = book;
    }
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BuddyInfo> book;

    @Id
    private int id;
    public AddressBook(List<BuddyInfo> book){
        this.book = book;
    }

    public AddressBook(){ this.book = new ArrayList<BuddyInfo>();};

    public List<BuddyInfo> getBook(){
        return this.book;
    }

//    public void getInfo(){
//        for(BuddyInfo buddy: this.book){
//            System.out.println(buddy.toString());
//        }
//    }

//   // public BuddyInfo getFirst(){
//        return book.get(0);
//    }

//    public static void main(String args[]){
//        BuddyInfo buddy1 = new BuddyInfo("Bob", "123");
//        BuddyInfo buddy2 = new BuddyInfo("Jane", "143");
//        List<BuddyInfo> buddyList =new ArrayList<BuddyInfo>();
//        buddyList.add(buddy1);
//        buddyList.add(buddy2);
//        AddressBook book = new AddressBook(buddyList);
//        book.getInfo();
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        this.book.add(buddyInfo);
    }

    public String toString(){
        String s ="";
        for(BuddyInfo buddy: this.book){
            s+= buddy.toString();
        }
        return s;
    }

    public BuddyInfo removeById(int id){
        BuddyInfo b;
        for(BuddyInfo buddy: book){
            if(buddy.getId() == id){
                book.remove(buddy);
                return buddy;
            }
        }

       return null;
    }
}
