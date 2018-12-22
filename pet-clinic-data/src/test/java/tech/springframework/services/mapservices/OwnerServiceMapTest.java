package tech.springframework.services.mapservices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.springframework.model.Owner;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    private Long ownerId=2L;
    private final String firstName="Kedar";

    @BeforeEach
    void setUp() {
      ownerServiceMap=new OwnerServiceMap();
      Owner owner=new Owner();
      owner.setId(2L);
      owner.setLastName("Erande");
      owner.setFirstName("Kedar");
      ownerServiceMap.save(2L,owner);

    }

    @Test
    void findByFirstName() {
       Owner owner=ownerServiceMap.findByFirstName(firstName);
       assertNotNull(owner);
       assertEquals(ownerId,owner.getId());
    }

    @Test
    void findAll() {
        Set<Owner> owner=ownerServiceMap.findAll();
        assertEquals(1,owner.size());
    }

    @Test
    void findById() {
        Owner owner=ownerServiceMap.findById(ownerId);
        assertNotNull(owner);
        assertEquals(ownerId,owner.getId());

    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0,ownerServiceMap.findAll().size());

    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0,ownerServiceMap.findAll().size());

    }

    @Test
    void save() {
     Owner owner=ownerServiceMap.findByFirstName(firstName);
     assertNotNull(owner);
     assertEquals(ownerId,owner.getId());

    }
}