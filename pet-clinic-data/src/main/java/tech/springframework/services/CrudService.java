package tech.springframework.services;

import java.util.Set;

public interface CrudService<T,ID> {


   Set<T> findAll();

   T findById(ID id);

   T save(T object);

   boolean deleteById(ID id);

   boolean delete(T object);

   




}