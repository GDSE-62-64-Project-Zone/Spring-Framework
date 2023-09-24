package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dinuki implements GoodGirl{
    @Override
    public void chatting() {
        System.out.println("Dinuki: Hello..");
    }
}
