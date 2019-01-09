package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import domain.AdminBean;
import factory.DatabaseFactory;

public class AdminDAOImpl implements AdminDAO {

	private static AdminDAOImpl instance = new AdminDAOImpl();
	private AdminDAOImpl(){}
	public static AdminDAOImpl getInstance() {return instance;}
	
	private ResultSet rs;
	@Override
	public void insertAdmin(AdminBean admin) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public ArrayList<AdminBean> selectAllAdmin() {
		ArrayList<AdminBean> list = new ArrayList<>();
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<AdminBean> selectAdminByNames(String name) {
		ArrayList<AdminBean> list = new ArrayList<>();
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public AdminBean selectAdminByAdminNum(String adminNum) {
		AdminBean admin = new AdminBean();
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}

	@Override
	public int countAdmins() {
		int count = 0;
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public boolean existAdmin(String adminNum){
		boolean exist = false;
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exist;
	}

	@Override
	public void updateAuth(String newAuth) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void deleteAdmin(String adminNum) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
