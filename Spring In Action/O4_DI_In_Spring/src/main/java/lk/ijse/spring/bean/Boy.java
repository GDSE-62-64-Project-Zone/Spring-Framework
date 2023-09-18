package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired
    Girl girl;

    public Boy(){
        System.out.println("Boy Instantiated");
    }

    public void trying(){
//        Girl girl = new Girl();
        girl.chatting();
    }
}
