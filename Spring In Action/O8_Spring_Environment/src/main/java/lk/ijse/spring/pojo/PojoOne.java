package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements InitializingBean {

    //${} - Property Placeholder
    @Value("${USER}")
    private String userName;

    @Value("${os.name}")
    private String osName;

    @Value("${url}")
    private String url;

    @Autowired
    Environment env;

    public PojoOne(){
        System.out.println("Pojo One Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.userName);
        System.out.println(this.osName);
        System.out.println(this.url);


        System.out.println("===========");
        //Will return a null if the key is wrong or missing
        String user1 = env.getProperty("USSER");

        //will return an exception if the key is missing or wrong
        String user2 = env.getRequiredProperty("urls");

        System.out.println(user1);
        System.out.println(user2);

    }
}
