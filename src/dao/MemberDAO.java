package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {

	public void insertMember(MemberBean member);

	public ArrayList<MemberBean> selectAllMembers();

	public ArrayList<MemberBean> selectMembersByNames(String name);

	public MemberBean selectById(String id);

	public int countMembers();

	public void updateMember(String id, String pass, String newPass);

	public void deleteMember(String id, String pass);
}
