package cn.funcode.yslspringbootstarter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Slf4j
@Configuration
@EnableConfigurationProperties(YslProperties.class)
public class YslConfig {

    @Autowired
    public YslProperties yslProperties;

    @Bean
    public YslService getYslService() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String beanName = "cn.funcode." + yslProperties.getBundleName() + ".YslServiceImpl";
         return (YslService)Class.forName(beanName).newInstance();
    }

}
