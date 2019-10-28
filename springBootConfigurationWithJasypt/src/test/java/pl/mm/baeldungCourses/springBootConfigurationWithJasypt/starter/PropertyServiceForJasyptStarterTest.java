package pl.mm.baeldungCourses.springBootConfigurationWithJasypt.starter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyServiceForJasyptStarterTest {

	@Autowired
	private ApplicationContext appCtx;

	@Test
	public void whenDecryptedPasswordNeeded_GetFromService() {
		System.setProperty("jasypt.encryptor.password", "password");
		PropertyServiceForJasyptStarter service = appCtx.getBean(PropertyServiceForJasyptStarter.class);

		assertEquals("Password@1", service.getProperty());

		Environment environment = appCtx.getBean(Environment.class);

		assertEquals("Password@1", service.getPasswordUsingEnvironment(environment));
	}

}