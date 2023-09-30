package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class E_Query_Sting_Parameters_Controller {
//When we have ambiguous mapping we can handle it using
//Query String parameters also
//params = {"id","name"} @RequestParam("id")


//http://localhost:8080/mapping/validate?id=C001&name=Dasun

    @GetMapping()
    public String getMapping2(){
        return "Get Mapping Invoked 2";
    }

    @GetMapping(params = {"id"})
    public String getMapping1(String id){
        return "Get Mapping Invoked 1 "+id;
    }




}
