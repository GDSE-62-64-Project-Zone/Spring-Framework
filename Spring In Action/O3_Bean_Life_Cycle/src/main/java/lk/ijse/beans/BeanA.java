package lk.ijse.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanA implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    //02. Populate Properties
    //03.Bean Name Awareness
    //04. Bean Factory Awareness
    //05. Application Context Awareness
    //06. Initializing Bean
    //07. Disposable Bean

    public BeanA(){
        System.out.println("BeanA : constructor - Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean A Name Awareness "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean A  Factory Awareness (DI)");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean A Application Context Awareness (DP,AOP)");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean A Initializing Bean - Bean is ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean A Disposable Bean - Now my service is over - I am ready to die");
    }
}
