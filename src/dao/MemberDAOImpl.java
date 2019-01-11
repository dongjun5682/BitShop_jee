package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;
import factory.DatabaseFactory;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl Instance = new MemberDAOImpl();

	private MemberDAOImpl() {
	}

	public static MemberDAOImpl getInstance() {
		return Instance;
	}


	@Override
	public void insertMember(MemberBean member) {
		try {
			int rs = DatabaseFactory
					.createDatabase("oracle")
					.getConnection()
					.createStatement()
					.executeUpdate(String.format("INSERT INTO member(id,name,pass,ssn)" + "VALUES('%s','%s','%s','%s')",
							member.getId(), member.getName(), member.getPass(), member.getSsn()));

			if (rs == 1) {
				System.out.println("회원가입 성공!");
			} else {
				System.out.println("회원가입 실패!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			String sql = "select * from member";
			ResultSet rs =DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);
			
			while (rs.next()) {
				MemberBean member = new MemberBean();
				list.add(member);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("selectBY1 :::::::" + list);

		return list;

	}

	@Override
	public ArrayList<MemberBean> selectMembersByNames(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			String sql = String.format("", "");
			ResultSet rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = null;
		try {
		
			ResultSet rs = DatabaseFactory
					.createDatabase("oracle")
					.getConnection()
					.createStatement()
					.executeQuery(String.format("SELECT * FROM member\n"
							+ "WHERE id LIKE '%s'",id));		
			while (rs.next()) {
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		try {
			String sql = String.format("", "");
			ResultSet rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);
			while (rs.next()) {

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void updateMember(String id, String pass, String newPass) {

		try {
			String sql = String.format("", "");
			int rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if (rs == 1) {
				System.out.println("입금성공!!");
			} else {
				System.out.println("입금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMember(String id, String pass) {

		try {
			String sql = String.format("", "");
			int rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if (rs == 1) {
				System.out.println("출금성공!!");
			} else {
				System.out.println("출금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberBean existMember(String id, String pass) {
		MemberBean member = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeQuery(String.format("SELECT * FROM member WHERE id LIKE '%s' AND pass LIKE '%s' ",id,pass));
			while(rs.next()){
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setPass(rs.getString("pass"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}

}
