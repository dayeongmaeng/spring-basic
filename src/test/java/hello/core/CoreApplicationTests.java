package hello.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoreApplicationTests {
	//단일테스트가 중요한이유. @SpringBootTest 는 스프링, DB등 복잡할 수록 속도가 느려지기 때문에 단일 테스트가 중요하다
	@Test
	void contextLoads() {
	}

}
