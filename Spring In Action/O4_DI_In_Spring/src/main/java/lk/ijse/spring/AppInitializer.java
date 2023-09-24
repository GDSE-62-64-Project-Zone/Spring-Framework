package lk.ijse.spring;

import lk.ijse.spring.bean.Boy;
import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.Hashan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Hashan hashan = ctx.getBean(Hashan.class);
        hashan.trying();

    }
}
