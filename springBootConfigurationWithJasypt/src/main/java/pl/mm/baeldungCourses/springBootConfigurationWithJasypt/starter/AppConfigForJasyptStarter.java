package pl.mm.baeldungCourses.springBootConfigurationWithJasypt.starter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("encrypted.properties")
public class AppConfigForJasyptStarter {
}
