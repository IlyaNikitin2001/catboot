package com.cat.Controller;

import com.Service.CatService;
import com.model.Cat;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.ManyToMany;

/**
 * Created by USER on 29.10.2017.
 */
@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MainController {
    CatService catService;
    @GetMapping("/")
    public String main(){
        return "index";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute Cat cat){
        catService.saveCat(cat);
        return "redirect:/";
    }
}
