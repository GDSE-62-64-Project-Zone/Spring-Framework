package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    public MyController(){
        System.out.println("MyController : Instantiated");
    }
}
