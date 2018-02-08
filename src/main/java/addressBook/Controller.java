package addressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {
    private AddressRepository repo;

    @Autowired
    public Controller(AddressRepository repo){
        this.repo = repo;
    }

    @RequestMapping(value = "/greeting/{bookId}", method = RequestMethod.POST)
    public BuddyInfo greetingSubmit(@RequestParam(value= "name") String name, @RequestParam(value = "number") String number, @PathVariable(value = "bookId") int bookId) {
        BuddyInfo buddy = new BuddyInfo(name, number);
        AddressBook book= repo.findOne(bookId);
        book.addBuddy(buddy);
        repo.save(book);
        return buddy;
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public AddressBook makeBook(){
        AddressBook book = new AddressBook();
        repo.save(book);
        return book;
    }

    @RequestMapping(value = "/greeting/{bookId}/{uId}", method = RequestMethod.POST)
    public BuddyInfo deleteBuddy(@PathVariable(value = "bookId") int bookId, @PathVariable(value="uId") int uId){
        AddressBook book= repo.findOne(bookId);
        BuddyInfo buddy =book.removeById(uId);
        repo.save(book);
        return buddy;
    }
}
