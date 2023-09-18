package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements Inject{

    //Property injection
//    @Autowired
    GoodGirlAgreement girl;


    // Constructor Injection
//    @Autowired
    public Boy(GoodGirlAgreement girl){
//        this.girl=girl;
        System.out.println("Boy Instantiated");
    }


    //setter method injection
//    @Autowired
    public void setGirl(GoodGirlAgreement girl){
//        this.girl=girl;
    }


    public void trying(){
        girl.chatting();
    }


    //Interface through injection
    @Autowired
    @Override
    public void setInject(GoodGirlAgreement gg) {
        this.girl=gg;
    }
}
