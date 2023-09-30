package lk.ijse.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")//handler mapping
public class CustomerController {

    //handler methods
    //handler mapping
    @GetMapping
    public String helloSpring(){
        return "Hello Iam Spring: Your Request Received";
    }

}
