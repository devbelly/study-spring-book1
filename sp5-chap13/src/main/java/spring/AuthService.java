package spring;

public class AuthService {
	
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao=memberDao;
	}
	
	public AuthInfo authenticate(String email,String password) {
		Member member = memberDao.selectByEmail(email);
		System.out.println(member.getEmail());
		System.out.println(member.getName());
		System.out.println(member.getPassword());
		if(member==null) {
			throw new WrongIdPasswordException();
		}
		if(!member.matchPassword(password)) {
			throw new WrongIdPasswordException();
		}
		return new AuthInfo(member.getId(),member.getEmail(),member.getName());
	}
}
