package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl Instance = new MemberDAOImpl();

	private MemberDAOImpl() {
	}

	public static MemberDAOImpl getInstance() {
		return Instance;
	}

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	@Override
	public void insertMember(MemberBean member) {
		 try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format(
					"INSERT INTO member(id,name,pass,ssn)"
					+ "VALUES('%s','%s','%s','%s')",member.getId(),member.getName(),member.getPass(),member.getSsn());
			System.out.println("SQL ::::: "+sql);
			//rs = stmt.executeQuery(sql); 
			int a = stmt.executeUpdate(sql); 
			if(a==1){
				System.out.println("회원가입 성공!");
			}else{
				System.out.println("회원가입 실패!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void selectMembers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void countMember() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(String id, String pass, String newPass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub

	}

}
