package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.LoggingAspect;

@Configuration
@ComponentScan(basePackages = {"services"})
@EnableAspectJAutoProxy
public class ProjectConfig {
	@Bean
	LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
