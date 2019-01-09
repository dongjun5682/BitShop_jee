package dao;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminDAO {

	public void insertAdmin(AdminBean admin);
	
	public ArrayList<AdminBean> selectAllAdmin();
	public ArrayList<AdminBean> selectAdminByNames(String name);
	public AdminBean selectAdminByAdminNum(String adminNum);
	
	public int countAdmins();
	public boolean existAdmin(String adminNum);
	public void updateAuth(String newAuth);
	
	public void deleteAdmin(String adminNum);
}
