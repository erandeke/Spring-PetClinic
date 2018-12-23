package tech.springframework.services.mapservices;

import org.springframework.stereotype.Service;
import tech.springframework.model.PetType;
import tech.springframework.services.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractMapServices<PetType, Long> implements PetTypeService {

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(Long id, PetType petType) {
        return super.save(id, petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }
}
