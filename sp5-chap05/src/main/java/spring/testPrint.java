package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class testPrint {
	
	@Autowired
	@Nullable
	private FastMemberDao memberDao;
	
	public void print() {
		if(memberDao!=null) {
			System.out.print("data exist\n");
		}
		else {
			System.out.println("no data\n");
		}
	}
}
