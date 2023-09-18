package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirlAgreement {
    public Girl(){
        System.out.println("Girl Instantiated");
    }

    @Override
    public void chatting(){
        System.out.println("La la");
    }
}
