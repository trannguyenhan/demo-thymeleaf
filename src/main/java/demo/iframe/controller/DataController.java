package demo.iframe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {
    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }
}
