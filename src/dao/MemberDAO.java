package dao;

public interface MemberDAO {

	public void createMember(String id,String name, String pass, String ssn );
	
	public void	selectMembers();
	public void selectByName(String name);
	public void selectById(String id);
	public void countMember();
	public void updateMember(String id,String pass, String newPass);
	public void deleteMember(String id,String pass);
}
