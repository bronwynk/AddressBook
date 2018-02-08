package addressBook;
import addressBook.BuddyInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BuddyRepository extends CrudRepository<BuddyInfo, Integer> {
    List<BuddyInfo> findAllById(int id);

}
