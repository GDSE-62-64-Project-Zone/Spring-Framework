package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class RestArchController {

    public RestArchController(){
        System.out.println("RestArchController");
    }

    //No need of view resolvers
    //Will return anything you return by wrapping it into a HTTP response if compatible

    //Ambiguous Mapping


    @GetMapping
    public String getMapping(){
       return "Get Mapping Invoked";
    }

    @PostMapping
    public String postMapping(){
        return "Post Method Invoked";
    }

    @PutMapping
    public String putMapping(){
        return "Put Mapping Invoked";
    }

    @DeleteMapping
    public String deleteMapping(){
        return "Delete Mapping Invoked";
    }
}
