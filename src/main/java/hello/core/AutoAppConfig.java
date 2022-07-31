package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        지정하지 않으면, @ComponentScan이 붙은 hello.core 부터 하위 패키지 다 찾음
//        권장 방법 : 최상단 (스프링부트 default)
//        basePackages = "hello.core.member",
//        basePackageClasses = AutoAppConfig.class,
        //예제 코드 유지를 위함
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
