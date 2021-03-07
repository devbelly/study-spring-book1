package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberRegisterService;

import spring.*;

@Configuration
public class AppConf2 {
	
	@Autowired
	private MemberDao memberDao;
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao);
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService changePwdSvc = new ChangePasswordService();
		changePwdSvc.setMemberDao(memberDao);
		return changePwdSvc;
	}
}
