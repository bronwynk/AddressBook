package addressBook;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<AddressBook,Integer> {
    List<AddressBook> findAllById(int id);

}
