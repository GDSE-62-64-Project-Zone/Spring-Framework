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
    public String getMapping1(){
       return "Get Mapping Invoked 1";
    }

    @GetMapping
    public String getMapping2(){
        return "Get Mapping Invoked 2";
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
