package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	public static MemberServiceImpl getInstance(){return instance;}
	
	MemberDAOImpl dao;
	
	@Override
	public void createMember(MemberBean member) {
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> filndAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		list = dao.selectAllMembers();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;

	}

	@Override
	public MemberBean findMemberById(String id) {
		MemberBean member = new MemberBean();
		member = dao.selectById(id);
		return member;
	}

	@Override
	public void countMembers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void existMember(String id, String pass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changMember(MemberBean member) {

	}

	@Override
	public void removeMember(String id, String pass) {
		// TODO Auto-generated method stub

	}

}
