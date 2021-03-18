package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import apsect.CacheAspect;
import apsect.ExeTimeAspect;
import chap07.Calculator;
import chap07.REcCalculator;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {
	@Bean
	public CacheAspect cacheAspect() {
		return new CacheAspect();
	}
	
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	@Bean
	public Calculator calculator() {
		return new REcCalculator();
	}
}
