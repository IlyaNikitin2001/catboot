package com.Dao;

import com.model.Cat;
import org.hibernate.SessionFactory;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by USER on 01.11.2017.
 */
public interface CatDao extends CrudRepository<Cat, Integer> {

}
