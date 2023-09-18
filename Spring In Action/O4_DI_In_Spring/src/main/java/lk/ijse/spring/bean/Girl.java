package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl {
    public Girl(){
        System.out.println("Girl Instantiated");
    }

    public void chatting(){
        System.out.println("La la");
    }
}
