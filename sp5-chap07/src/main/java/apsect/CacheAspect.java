package apsect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CacheAspect {
	private Map<Long,Object> cache = new HashMap<>();
	
	@Pointcut("execution(* chap07..*.*(..))")
	public void cacheTarget() {
		
	}
	
	@Around("cacheTarget()")
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
		Long num=(Long)joinPoint.getArgs()[0];
		if(cache.containsKey(num)) {
			System.out.println("이미 존재합니다");
			return cache.get(num);
		}
		Object ret = joinPoint.proceed();
		cache.put(num, ret);
		System.out.println("cache에 추가");
		return ret;
	}
}
