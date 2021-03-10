package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("Client destory 실행");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Client initializing 실행");
	}
	
	public void send() {
		System.out.println("메세지 전송");
	}
}
