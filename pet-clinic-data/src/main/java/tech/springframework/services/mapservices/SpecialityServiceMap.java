package tech.springframework.services.mapservices;

import org.springframework.stereotype.Service;
import tech.springframework.model.Speciality;
import tech.springframework.services.SpecialityService;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapServices<Speciality, Long> implements SpecialityService {


    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Long id, Speciality object) {
        return super.save(id, object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
