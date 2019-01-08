package service;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = new MemberServiceImpl();

	private MemberServiceImpl() {
	}
	public static MemberServiceImpl getInstance(){
		return instance;
	}
	
	@Override
	public void joinMember(MemberBean member) {
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public void listMembers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void findByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		System.out.println("멤버 아이디 ::"+member.getId());
		return member;
	}

	@Override
	public void countMember() {
		// TODO Auto-generated method stub

	}

	@Override
	public void existMember(String id, String pass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub

	}

}
