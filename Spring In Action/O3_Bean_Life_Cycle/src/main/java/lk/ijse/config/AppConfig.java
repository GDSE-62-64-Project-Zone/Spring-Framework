package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.beans")
public class AppConfig {
    public AppConfig(){
        System.out.println("App Config- Constructor");
    }

}
