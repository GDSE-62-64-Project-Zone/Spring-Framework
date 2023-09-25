package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
//@Import({ConfigTwo.class,ConfigThree.class})
//@ImportResource({"classpath:abcd.xml"})
public class AppConfig {
    public AppConfig(){
        System.out.println("App Config Instantiated");
    }

    @Bean
    public PojoOne pojoOne(){
        return new PojoOne();
    }

}
