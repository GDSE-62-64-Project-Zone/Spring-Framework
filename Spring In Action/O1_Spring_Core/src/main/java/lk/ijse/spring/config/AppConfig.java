package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
   public AppConfig(){
       System.out.println("App Config");
   }

   //bean methods
   @Bean("pool")
   public BasicDataSource dataSource(){
       return new BasicDataSource();
   }
}
