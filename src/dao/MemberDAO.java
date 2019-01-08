package dao;

import domain.MemberBean;

public interface MemberDAO {

	public void insertMember(MemberBean member);
	
	public void	selectMembers();
	public void selectByName(String name);
	public void selectById(String id);
	public void countMember();
	public void updateMember(String id,String pass, String newPass);
	public void deleteMember(String id,String pass);
}
