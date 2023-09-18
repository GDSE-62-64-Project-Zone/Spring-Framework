package lk.ijse.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.beans")
public class AppConfig implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public AppConfig(){
        System.out.println("App Config- Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("AppConfig Name Awareness "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("AppConfig  Factory Awareness (DI)");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("AppConfig Application Context Awareness (DP,AOP)");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AppConfig Initializing Bean - Bean is ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("AppConfig Disposable Bean - Now my service is over - I am ready to die");
    }
}
