package tech.springframework.services.mapservices;

import org.springframework.stereotype.Service;
import tech.springframework.model.Vet;
import tech.springframework.services.VetService;

@Service
public class VetServiceMap extends  AbstractMapServices<Vet,Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Long id, Vet object) {
        return  super.save(id,object);
    }

    @Override
    public void deleteById(Long id) {
          super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        map.entrySet().removeIf(entry->entry.getValue().equals(vet));


    }
}
