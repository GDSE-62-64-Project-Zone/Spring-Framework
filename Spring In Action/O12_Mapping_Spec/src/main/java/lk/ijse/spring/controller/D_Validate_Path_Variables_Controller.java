package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate")
public class D_Validate_Path_Variables_Controller {
//With path variables we have the validating options also
//01.Reg Ex Validation path={/path:[a-z]{3}}
//02.Single Character Validations path={/pa?h}
//03.Single Wild Card Validator path={/path/*/id}
//04Multiple Wild Card Validator path={/path/**/id}


    //matchers with path segments
    @GetMapping(path = "/i?d")
    public String getMapping2(){
        return "Get Mapping Invoked 1 ";
    }

    //request narrow downing using path segments
    @GetMapping(path = "/id??/nam??e")
    public String getMapping1(){
        return "Get Mapping Invoked 2 ";
    }


}
