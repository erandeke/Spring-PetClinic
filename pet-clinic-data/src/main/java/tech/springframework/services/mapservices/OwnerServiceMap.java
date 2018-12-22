package tech.springframework.services.mapservices;

import org.springframework.stereotype.Service;
import tech.springframework.model.Owner;
import tech.springframework.services.CrudService;
import tech.springframework.services.OwnerService;

import java.util.Map;
import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapServices<Owner, Long>  implements OwnerService {

    @Override
    public Owner findByFirstName(String firstName) {
        return map.entrySet().stream()
                .filter(entry->entry.getValue().getFirstName().equals(firstName))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }


    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);

    }

    @Override
    public void delete(Owner object) {
          super.delete(object);

    }

    @Override
    public Owner save(Long id, Owner owner)
    {
         return  super.save(id,owner);
    }

}
