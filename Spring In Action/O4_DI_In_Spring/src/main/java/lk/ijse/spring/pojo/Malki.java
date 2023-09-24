package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Malki implements GoodGirl{
    public Malki(){
        System.out.println("Malki Instantiated");
    }

    @Override
    public void chatting(){
        System.out.println("Malki : Hello....!");
    }
}
