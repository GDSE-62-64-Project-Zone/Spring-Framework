package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);

        //so if we want to add more configurations than one. so we can add them
        //using several ways

        //01. we can register more config classes using register method
        //ctx.register(ConfigTwo.class);
        //ctx.register(ConfigThree.class);

        //02. we can use @import annotation to import configuration class from another configuration class
        //03 Also we can use @ComponentScan annotation to scan all the Configuration classes
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
