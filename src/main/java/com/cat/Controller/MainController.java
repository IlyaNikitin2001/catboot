package com.cat.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by USER on 29.10.2017.
 */
@Controller
public class MainController {
    @GetMapping("/")
    public String main(){
        return "index";
    }
}
