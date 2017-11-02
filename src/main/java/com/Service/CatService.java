package com.Service;

import com.Dao.CatDao;
import com.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by USER on 01.11.2017.
 */
@Service
public class CatService {
    CatDao catDao;
    @Autowired
    public void setCatDao(CatDao catDao) {
        this.catDao = catDao;
    }
    public void saveCat(Cat cat){
        this.catDao.save(cat);
    }

}
