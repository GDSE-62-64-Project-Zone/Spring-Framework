package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {
     public PojoOne(){
         System.out.println("Pojo One Instantiated");
     }


//Light Mode
//if you introduce bean methods from a spring bean this mode is known as spring's light mode
// So the speciality is here they don't support inter-bean dependencies
    @Bean
    public PojoTwo pojoTwo(){
        //Inter bean dependencies
        //Inter-bean dependency invocation

        //In light mode inter-bean dependencies are not supported
        PojoThree pojoThree1 = pojoThree();//these are just normal objects which is not mange by the spring container
        PojoThree pojoThree2 = pojoThree();
        System.out.println(pojoThree1);
        System.out.println(pojoThree2);

        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
