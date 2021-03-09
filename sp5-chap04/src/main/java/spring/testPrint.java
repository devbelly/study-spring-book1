package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class testPrint {
	
	@Autowired
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
