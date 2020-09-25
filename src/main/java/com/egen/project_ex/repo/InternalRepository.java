package com.egen.project_ex.repo;

import com.egen.project_ex.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalRepository extends CrudRepository<Order,String > {

}
