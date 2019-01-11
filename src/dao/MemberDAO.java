package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {

	public void insertMember(MemberBean member);

	public ArrayList<MemberBean> selectAllMembers();

	public ArrayList<MemberBean> selectMembersByNames(String name);

	public MemberBean selectMemberById(String id);

	public int countMembers();
	public MemberBean existMember(String id, String pass);
	
	public void updateMember(String id, String pass, String newPass);

	public void deleteMember(String id, String pass);
}
