package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.LoginController;
import controller.RegisterController;

@Configuration
public class ControllerConfig {
	
	@Bean
	public RegisterController registerController() {
		return new RegisterController();
	}
	
	@Bean
	public LoginController loginController() {
		LoginController controller = new LoginController();
		return controller;
	}
	
}
