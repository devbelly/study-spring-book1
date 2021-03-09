package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.CachedMemberDao;
import spring.ChangePasswordService;
import spring.FastMemberDao;
import spring.MemberDao;
import spring.MemberRegisterService;
import spring.testPrint;

@Configuration
public class AppCtx {
	
	@Bean
	public MemberDao memberDao1() {
		return new MemberDao();
	}
	
	@Bean
	public CachedMemberDao cachedMemberDao2() {
		return new CachedMemberDao();
	}
	
//	@Bean
//	public FastMemberDao fastMemberDao() {
//		return new FastMemberDao();
//	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
//		pwdSvc.setMemberDao(memberDao()); 제거!
		return pwdSvc;
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
//		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public testPrint testprint() {
		return new testPrint();
	}
}
