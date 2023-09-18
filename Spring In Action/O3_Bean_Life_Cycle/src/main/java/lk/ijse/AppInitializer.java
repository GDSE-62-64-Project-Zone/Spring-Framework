package lk.ijse;

import lk.ijse.beans.BeanA;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                ctx.close();
//            }
//        }));


        BeanA bean1 = ctx.getBean(BeanA.class);
        System.out.println(bean1);

        BeanA bean2 = ctx.getBean(BeanA.class);
        System.out.println(bean2);






    }
}
