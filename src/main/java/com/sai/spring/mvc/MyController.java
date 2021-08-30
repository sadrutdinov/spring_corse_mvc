package com.sai.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-detail-view";
    }


    @RequestMapping("/showDetails")
    public String showEmpDetails() {
        return "show-emp-detail-view";
    }


}
