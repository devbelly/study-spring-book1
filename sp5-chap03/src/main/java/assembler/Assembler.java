package assembler;

import spring.*;

public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler() {
		memberDao = new MemberDao(); // new cachedMemberDao(); 로 수정해주면 해결
		regSvc=new MemberRegisterService(memberDao);
		pwdSvc=new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}


	public MemberRegisterService getRegSvc() {
		return regSvc;
	}


	public ChangePasswordService getPwdSvc() {
		return pwdSvc;
	}

}
