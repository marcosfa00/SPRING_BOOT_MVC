package com.spring.Marcosfa.repositorio;

import com.spring.Marcosfa.entidades.FirstEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //esta anotacion no es obligatoria siempre y cuando la interfaz extienda de CrudRepository
public interface FirstRepository extends CrudRepository<FirstEntity,Integer> {
}
