package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.CachedMemberDao;
import spring.ChangePasswordService;
import spring.FastMemberDao;
import spring.MemberDao;
import spring.MemberRegisterService;
import spring.testPrint;

@Configuration
@ComponentScan(basePackages = {"spring"})
public class AppCtx {
}
