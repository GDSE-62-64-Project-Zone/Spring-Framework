package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/form")
public class B_X_WWW_Url_Encoded_Controller {
    //So there are many ways that we can pass data between
    //client and server
    //01 Query String
    //02 X-WWW-Form-Url-Encoded
    //03 JSON
    //04 Path variables with Path Segments

    //02 X-WWW-Form-Url-Encoded
    //How to access above type data from spring
    //@Model Attribute


    //This will catch x-www-form-url-encoded data without any issue
    //But you have to consider the key names and parameter name
    //font end id=C001 -> String id (key and param name should be same)
    @PostMapping
    public String receiveDataWithFormData(String id,String name,String address){
        return "X-WWW-Form-URL-Encoded-Data : "+id+" "+name+" "+address;
    }

}
