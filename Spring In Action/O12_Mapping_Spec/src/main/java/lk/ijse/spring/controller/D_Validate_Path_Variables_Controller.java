package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class D_Validate_Path_Variables_Controller {
//With path variables we have the validating options also
//01.Reg Ex Validation path={/path:[a-z]{3}}
//02.Single Character Validations path={/pa?h}
//03.Single Wild Card Validator path={/path/*/id}
//04Multiple Wild Card Validator path={/path/**/id}


    //path segments
    @GetMapping(path = "/i?d")
    public String getMapping2(@PathVariable("id") String ids){ //alies
        System.out.println(ids);
        return "Get Mapping Invoked 1 "+ids;
    }

    //request narrow downing using path segments
    @GetMapping(path = "/id??/nam??e")
    public String getMapping1(@PathVariable String id,@PathVariable String name){
        System.out.println(id+" "+name);
        return "Get Mapping Invoked 2 "+id+" "+name;
    }


}
