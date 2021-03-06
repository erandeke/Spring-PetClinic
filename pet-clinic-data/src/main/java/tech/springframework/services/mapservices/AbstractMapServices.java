package tech.springframework.services.mapservices;

import tech.springframework.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapServices<T, ID> implements CrudService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();


    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(ID id, T object) {
        return map.putIfAbsent(id, object);
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);

    }

    @Override
    public void delete(T object) {

        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));

    }
}
