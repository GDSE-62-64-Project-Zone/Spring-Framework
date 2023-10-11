package lk.ijse.spring;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class WebAppInitializer{
    public static void main(String[] args) {
        SpringApplication.run(WebAppInitializer.class);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}

// Dependencies can be manage easily with starters (OneStop Shops)
// Automatic configurations
// Automatic deployment using embedded containers (Tomact,Jetty)
// This can be run as a jar application (stand alone)

//So what are starters.?
//they are set of convenient dependency descriptors
// (One stop shop to download all required dependencies)