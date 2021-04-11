package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.ChangePwdController;
import controller.LoginController;
import controller.LogoutController;
import controller.MemberDetailController;
import controller.MemberListController;
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
	
	@Bean
	public LogoutController logoutController() {
		return new LogoutController();
	}
	
	@Bean
	public ChangePwdController changePwdController() {
		ChangePwdController controller = new ChangePwdController();
		return controller;
	}
	
	@Bean
	public MemberListController memberListController() {
		MemberListController controller = new MemberListController();
		return controller;
	}
	
	@Bean
	public MemberDetailController memberDetailController() {
		MemberDetailController controller = new MemberDetailController();
		return controller;
	}
}
