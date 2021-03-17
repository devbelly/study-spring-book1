package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.Calculator;
import chap07.REcCalculator;
import config.AppCtx;

public class MainAspect {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppCtx.class);
		
		//Calculator cal = ctx.getBean("calculator",Calculator.class);
		REcCalculator cal= ctx.getBean("calculator",REcCalculator.class);
		cal.factorial(5);
		System.out.println(cal.getClass().getName());
	}
}
