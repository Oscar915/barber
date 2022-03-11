package com.back.barber;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.main.lazy-initialization=true",classes = {BarberApplicationTests.class})
class BarberApplicationTests {

	@Test
	void contextLoads() {
	}

}
