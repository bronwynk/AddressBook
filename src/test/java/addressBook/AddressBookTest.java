package addressBook;

import org.junit.Test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddressBookTest {
    @Test
    public void getBook() throws Exception {
        List<BuddyInfo> buddys = new ArrayList<BuddyInfo>();
        AddressBook book = new AddressBook(buddys);
        assertEquals(book.getBook(), new ArrayList<BuddyInfo>());
    }

//    @Test
//    public void getInfo() throws Exception {
//        List<BuddyInfo> buddys = new ArrayList<BuddyInfo>();
//        buddys.add(new BuddyInfo("Jane", "123"));
//        AddressBook book = new AddressBook(buddys);
//        assertEquals(book.getFirst().toString(), "Jane 123");
//    }

}