package com.sai.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-detail-view";
    }


//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//
//        String employeeName = request.getParameter("employeeName");
//        employeeName = "Mr. " + employeeName;
//
//        model.addAttribute("nameAttribute", employeeName);
//        model.addAttribute("description", " - udemy instructor");
//
//
//        return "show-emp-detail-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {

        empName = "Bro " + empName;
        model.addAttribute("nameAttribute", empName);



        return "show-emp-detail-view";
    }


}
