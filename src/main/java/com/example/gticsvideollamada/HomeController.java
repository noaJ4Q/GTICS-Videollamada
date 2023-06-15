package com.example.gticsvideollamada;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping(value = {"", "/", "index"})
    public String index(){
        return "index";
    }

    @GetMapping("/reunion")
    public String reunion(@RequestParam("id") String id){
        return "reunion";
    }
}
