package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Instantiated");
    }

    //when we have constructor parameters we have to give values for this
    //So this is a one way which we can give values for the constructor parameters
//    @Bean
//    public String test(){
//        return "Hello";
//    }

    //and the second way is we can use @Value annotation to inject values
    //Runtime to the constructor parameter
}
