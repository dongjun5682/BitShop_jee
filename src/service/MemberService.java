package service;

import domain.MemberBean;

public interface MemberService {

	public void joinMember(MemberBean member);
	
	public void listMembers();
	public void findByName(String name);
	public MemberBean findById(String id);
	
	public void countMember();
	public void existMember(String id,String pass);
	
	public void updatePass(String id,String pass, String newPass);
	
	public void deleteMember(String id,String pass);
}
