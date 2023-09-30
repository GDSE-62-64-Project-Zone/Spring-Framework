package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestArchController {

    public RestArchController(){
        System.out.println("RestArchController");
    }

    //No need of view resolvers
    //Will return anything you return by wrapping it into a HTTP response if compatible

    //Ambiguous Mapping


//    @GetMapping
//    public void test1(){
//        System.out.println("Test method invoked");
//    }

    @GetMapping
    public String test2(){
       return "Hello this is generated from Spring";
    }


    @PostMapping
    public String postMapping(){
        return "Post Method Invoked";
    }
}
