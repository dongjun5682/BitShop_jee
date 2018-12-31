package service;

public interface MemberService {

	public void join(String id,String name, String pass, String ssn );
	
	public void list();
	public void findByName(String name);
	public void findById(String id);
	
	public void count();
	public void existMember(String id,String pass);
	
	public void updatePass(String id,String pass, String newPass);
	
	public void deleteMember(String id,String pass);
}