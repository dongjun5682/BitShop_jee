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
		return dao.selectAllMembers();
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;

	}

	@Override
	public MemberBean findMemberById(String id) {
		return dao.selectMemberById(id);
	}

	@Override
	public void countMembers() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist = false;
		MemberBean member = new MemberBean();
		member = dao.existMember(id, pass);
		if(member != null){
			exist = true;
		}
		return exist;
	}

	@Override
	public void changMember(MemberBean member) {

	}

	@Override
	public void removeMember(String id, String pass) {
		// TODO Auto-generated method stub

	}

}
