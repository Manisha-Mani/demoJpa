package com.example.demoJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoJpa.entity.ProductEntity;
/*DAO(Database Access Object) class needs to have methods to perform CRUD activities
 * Here we are extending the operations from existing repositories
 * To extend methods of CRUD operation, CrudRepository or JPA repository can be used.
 */
public interface ProductDao extends CrudRepository<ProductEntity, Integer>{

}
