package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class E_CustomerController {

    //add (POST)
    //delete (DELETE)
    //update (PUT)
    //search (GET)
    //get_all (GET)

    //every response should return a json object including state,message and data
    //return

    @PostMapping
    public void addCustomer(@RequestBody CustomerDTO dto){

    }

    @DeleteMapping(params = "id")
    public void deleteCustomer(@RequestParam String id){}


    @PutMapping
    public void updateCustomer(@RequestBody CustomerDTO dto){

    }

    @GetMapping(params = "id")
    public void searchCustomer(@RequestParam String id){}


    @GetMapping
    public void getAllCustomers(){

    }

}
