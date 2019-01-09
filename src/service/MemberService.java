package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {

	public void createMember(MemberBean member);
	
	public ArrayList<MemberBean> filndAllMembers();
	public ArrayList<MemberBean> findMembersByName(String name);
	public MemberBean findMemberById(String id);
	
	public void countMembers();
	public void existMember(String id,String pass);
	
	public void changMember(MemberBean member);
	
	public void removeMember(String id,String pass);
}
