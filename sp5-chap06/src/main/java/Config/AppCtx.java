package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import spring.*;
@Component
public class AppCtx {
	
	@Bean
	public Client client() {
		return new Client();
	}
}
