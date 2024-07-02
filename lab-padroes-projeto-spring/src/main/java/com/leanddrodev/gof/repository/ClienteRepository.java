package com.leanddrodev.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.leanddrodev.gof.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}