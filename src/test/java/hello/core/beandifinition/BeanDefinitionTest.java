package hello.core.beandifinition;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanDefinitionTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    //GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
    //xml로 할 경우 명확한 class 정보가 표시되고 appconfig.xml에 define 되어있다고 나옴
    //예전에는 bean에 대한 게 다 노출되었었는데 java로 변경되며 안나옴
    //직접 등록 -> xml, FactoryBean -> java

    @Test
    @DisplayName("빈 설정 메타정보 확인")
    void findApplicationBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames){
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                System.out.println("beanDefinitionNAme = " + beanDefinitionName +
                        " beanFifinition = " + beanDefinition);
            }
        }
    }
}
