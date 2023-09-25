package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//This is also not my class
public class PojoThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoThree(){
        System.out.println("Pojo Three Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Pojo3: Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Pojo3: Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pojo3: Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pojo3: Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Pojo3: Application Context Aware");
    }
}
