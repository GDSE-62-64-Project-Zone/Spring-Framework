package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segment")
public class B_Path_Segments_Controller {
//Ways of Ambiguous Mappings Resolving Methods
//01 Use path segments to narrow down requests
//path="/customer/add"
//localhost:8080/mapping/customer/add
//localhost:8080/mapping/customer/delete

    @GetMapping(path = "/one")
    public String getMapping1(){
        return "Get Mapping Invoked 1";
    }

    @GetMapping
    public String getMapping2(){
        return "Get Mapping Invoked 2";
    }

}
