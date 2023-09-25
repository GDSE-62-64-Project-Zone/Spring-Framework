package lk.ijse.spring.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {

//    public PojoOne(){
//        System.out.println("PojoOne Instantiated : Default");
//    }
//    public PojoOne(@Value("Hello Spring") String id){
//        System.out.println("PojoOne Instantiated "+id);
//    }

//    public PojoOne(@Value("100") int id){
//        System.out.println("PojoOne Instantiated "+id);
//    }

//    public PojoOne(@Value("false") boolean id){
//        System.out.println("PojoOne Instantiated "+id);
//    }

    public PojoOne(@Value("C001,C002,C003") String[] ids){
        System.out.println("PojoOne Instantiated "+ids);
        for (String id : ids) {
            System.out.println(id);
        }
    }
}
