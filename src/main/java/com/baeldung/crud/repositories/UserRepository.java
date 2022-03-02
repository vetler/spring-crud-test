package com.baeldung.crud.repositories;

import com.baeldung.crud.entities.EUser;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<EUser, Long> {
    
    List<EUser> findByName(String name);
    
}
