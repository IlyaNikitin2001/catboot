package com.Service;

import com.Dao.CatDao;
import com.model.Cat;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by USER on 01.11.2017.
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CatService {
   CatDao catDao;
    public void saveCat(Cat cat){
        this.catDao.save(cat);
    }
//Cat cat = new Cat ();
//    cat.
}
