package dao;

import java.sql.ResultSet;
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

	private ResultSet rs;

	@Override
	public void insertMember(MemberBean member) {
		try {
			// rs = stmt.executeQuery(sql);
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(String.format("INSERT INTO member(id,name,pass,ssn)" + "VALUES('%s','%s','%s','%s')",
							member.getId(), member.getName(), member.getPass(), member.getSsn()));

			if (a == 1) {
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
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while (rs.next()) {
				MemberBean member = new MemberBean();
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("pass"));
				System.out.println(rs.getString("ssn"));
				list.add(member);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("selectBY :::::::" + list);

		return list;

	}

	@Override
	public ArrayList<MemberBean> selectMembersByNames(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			String sql = String.format("", "");
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public MemberBean selectById(String id) {
		MemberBean member = new MemberBean();
		try {
			String sql = String.format("", "");
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);
			while (rs.next()) {
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("selectBY :::::::" + member);
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		try {
			String sql = String.format("", "");
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);
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
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if (a == 1) {
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
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if (a == 1) {
				System.out.println("출금성공!!");
			} else {
				System.out.println("출금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
