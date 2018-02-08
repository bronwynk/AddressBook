package addressBook;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.*;

import java.util.List;

import static org.junit.Assert.*;
public class BuddyInfoTest {
    @Test
    public void buddyInfoTest() throws Exception {
        BuddyInfo buddy = new BuddyInfo("Jane", "123");
        assertEquals(buddy.getNumber(), "123");
        assertEquals(buddy.getName(), "Jane");
    }

    @Test
    public void buddyToString() throws Exception{
        BuddyInfo buddy = new BuddyInfo("Jane", "123");
        String test = buddy.toString();
        assertEquals(test, "Jane 123");
    }

//    @Test
//    public void buddyPersistTest() throws Exception {
//        BuddyInfo buddy1 = new BuddyInfo();
//        buddy1.setId(1);
//        buddy1.setName("Jane");
//        buddy1.setNumber("123");
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        em.persist(buddy1);
//        tx.commit();
//
//        Query q = em.createQuery("SELECT buddy FROM BuddyInfo buddy");
//
//
//
//        @SuppressWarnings("unchecked")
//
//        List<BuddyInfo> results = q.getResultList();
//        for (BuddyInfo b : results) {
//           assertTrue(b.isEquals(buddy1));
//        }
//         em.close();
//         emf.close();
//    }

    @Before
    public void setUp(){}

}