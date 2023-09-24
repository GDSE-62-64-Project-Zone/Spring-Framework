package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hashan {

    @Autowired
    GoodGirl sandamali;

    public Hashan() {
        System.out.println("Hashan Instantiated");
    }

    public void trying() {
        sandamali.chatting();
    }

}
