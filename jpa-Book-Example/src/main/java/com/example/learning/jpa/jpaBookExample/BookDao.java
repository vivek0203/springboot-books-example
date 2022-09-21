package com.example.learning.jpa.jpaBookExample;

import org.springframework.data.repository.CrudRepository;

public interface  BookDao extends CrudRepository<Books,Integer> {

}
