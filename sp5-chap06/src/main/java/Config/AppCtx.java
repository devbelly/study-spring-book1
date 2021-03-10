package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.*;
@Component
public class AppCtx {
	
	@Bean
	@Scope("prototype")
	public Client client() {
		return new Client();
	}
}
