package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ChangePasswordService {
	
	private MemberDao memberDao;
	
	@Autowired
	public void setMemberDao(CachedMemberDao memberDao) {
		this.memberDao=memberDao;
	}
	public void setMemberDao() {}
	public void changePassword(String email,String oldPassword,String newPassword) {
		Member member = memberDao.selectByEmail(email);
		if(member==null) {
			throw new MemberNotFoundException();
		}
		member.changePassword(oldPassword, newPassword);
		memberDao.update(member);
	}
}
